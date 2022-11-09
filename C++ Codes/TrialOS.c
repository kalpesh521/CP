#include <stdio.h>

int main()
{
    int Max[10][10], avail[10][10], alloc[10][10], need[10][10], completed[10], safeseq[10];
    int count = 0;
    int p, r, i, j, process;

    printf("Enter process");
    scanf("%d", &p);

    for (i = 0; i < p; i++)
    {

        completed[i] = 0;
    }

    printf("Enter number of resources");
    scanf("%d", &r);
    printf("Enter number of max matrix of each resources");

    for (i = 0; i < p; i++)
    {

        printf("For process %d :", i + 1);
        for (j = 0; j < r; j++)
        {
            scanf("%d", &Max[i][j]);
        }
    }

    printf("enter allocation for each process ");
    for (i = 0; i < p; i++)
    {

        printf("For process %d :", i + 1);
        for (j = 0; j < r; j++)
        {
            scanf("%d", &alloc[i][j]);
        }
    }
    printf("Enter the available resources");

    for (i = 0; i < r; i++)
        scanf("%d", &avail[i]);

    for (i = 0; i < p; i++)
    {
        for (i = 0; j < r; j++)
        {
            need[i][j] = Max[i][j] - alloc[i][j];
        }
    }

    do

    {

        printf("\n Max matrix:\tAllocation matrix:\n");

        for (i = 0; i < p; i++)

        {

            for (j = 0; j < r; j++)

                printf("%d	", Max[i][j]);

            printf("\t\t");

            for (j = 0; j < r; j++)

                printf("%d	", alloc[i][j]);

            printf("\n");
        }
        process = -1;

        for (i = 0; i < 0; i++)
        {
            if (completed == 0)
            {
                process = i;
                for (j = 0; j < r; j++)
                {
                    if (avail[j] < need[i][j])
                    {
                        process = -1;
                        break;
                    }
                }
            }
        }if (process != -1){
            printf()
        }
    }