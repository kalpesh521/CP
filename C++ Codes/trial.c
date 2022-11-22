#include <stdio.h>
int n, nf;
int ref[100];
int p[50];
int i, j, k;
int pgfaultcnt = 0;
int hit = 0;

void getdata()
{
    printf("\nenter lenght of page reference");
    scanf("%d", &n);
    printf("enter page reference sequnce");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &ref[i]);
    }
    printf("enter no of frames ");
    scanf("%d", &nf);
}
void initialize()
{
    pgfaultcnt = 0;
    for (i = 0; i < nf; i++)
    {
        p[i] = 999;
    }
}

int isHit(int data)
{
    hit = 0;
    for (j = 0; j < nf; j++)
    {
        if (p[j] == data)
        {
            hit = 1;

            break;
        }
    }
    return hit;
}
void dispPages()
{
    for (k = 0; k < nf; k++)
    {
        if (p[k] != 9999)
            printf(" %d", p[k]);
    }
}
void dispPgfaultcnt()
{
    printf("\nTotal no of page faults:%d", pgfaultcnt);
}
void fifo()
{
    initialize();
    for (i = 0; i < n; i++)
    {
        printf("%d", ref[i]);
        if (isHit(ref[i]) == 0)
        {

            for (k = 0; k < nf - 1; i++)
            {
                p[k] = p[k + 1];
            }
            p[k] = ref[i];
            pgfaultcnt++;
            dispPages();
        }
        else
        {
            printf("Page fault not occured");
        }
    }
    dispPgfaultcnt();
}

void optimal()
{
    initialize();
    int near[50];
    for (int i = 0; i < n; i++)
    {
        printf("%d", ref[i]);
        if (isHit(ref[i] == 0))
        {
            for (int j = 0; j < nf; j++)
            {
                int pg = p[j];
                int found = 0;
                for (k = 0; k < n; k++)
                {
                    if (pg == ref[k])
                    {
                        near[j] = k;
                        found = 1;
                        break;
                    }
                    else
                    {
                        found = 0;
                    }
                }
                if (!found)
                {
                    near[j] = 9999;
                }
            }
            int max = -9999;
            int repindex;
            for (j = 0; j < nf; j++)
            {
                if (near[j] > max)
                {
                    max = near[j];
                    repindex = j;
                }
            }
            p[repindex] = ref[i];
            pgfaultcnt++;
            dispPages();
        }
        else
        {
            printf("Page Not found");
        }
    }
    dispPgfaultcnt();
}
void lru()
{
    initialize();
    int least[50];
    for (int i = 0; i < n; i++)
    {
        printf("%d", ref[i]);
        if (isHit(ref[i] == 0))
        {
            for (int j = 0; j < nf; j++)
            {
                int pg = p[j];
                int found = 0;
                for (k = i - 1; k >= 0; k--)
                {
                    if (pg == ref[k])
                    {
                        least[j] = k;
                        found = 1;
                        break;
                    }
                    else
                    {
                        found = 0;
                    }
                }
                if (!found)
                {
                    least[j] = -9999;
                }
            }
            int min = 9999;
            int repindex;
            for (j = 0; j < nf; j++)
            {
                if (least[j] < min)
                {
                    min = least[j];
                    repindex = j;
                }
            }
            p[repindex] = ref[i];
            pgfaultcnt++;
            dispPages();
        }
        else
        {
            printf("Page Not found");
        }
    }
    dispPgfaultcnt();
}

int main()
{
    int ch;

    while (1)
    {
        printf("\n\nenter yout choice\n");
        scanf("%d",&ch);
        switch (ch)
        {
        case 1:
            getdata();
            break;
        case 2:
            fifo();
            break;
        case 3:
            optimal();
            break;

        case 4:
            lru();
            break;
        default:
            return 0;
            break;
        }
    }
}