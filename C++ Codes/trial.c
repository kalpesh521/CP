#include <stdio.h>
#include <string.h>
#define MAX 10

int n, support[MAX];
int cnt = 0, j = 0, small_BT;
float total_wait_t = 0, total_TAT = 0, Avg_WT, Avg_TAT;

// Creating Structure...
struct data
{
    int wait_t, arrival_t, burst_t, turn_around_t;

} process[MAX];

// Calculate RR...
void rr()
{
    // initialize the burst time with maximum...
    process[MAX - 1].burst_t = 10000;
    for (j = 0; cnt != n; j++)
    {

        small_BT = MAX - 1;
        for (int i = 0; i < n; i++)
        {
            if (process[i].burst_t < process[small_BT].burst_t && (process[i].arrival_t <= j && process[i].burst_t > 0))
            {
                small_BT = i;
            }
        }

        process[small_BT].burst_t = process[small_BT].burst_t - 1;

        // if any process is completed...
        if (process[small_BT].burst_t == 0)
        {
            // one process completed...
            cnt++;
            process[small_BT].wait_t = j + 1 - process[small_BT].arrival_t - support[small_BT];
            process[small_BT].turn_around_t = j + 1 - process[small_BT].arrival_t;

            // total calculation...
            total_wait_t = total_wait_t + process[small_BT].wait_t;
            total_TAT = total_TAT + process[small_BT].turn_around_t;
        }
    }
    Avg_WT = total_wait_t / n;
    Avg_TAT = total_TAT / n;
}

// Display Details...
void display()
{
    printf("Process\tAT\tBT\tWT\tTAT\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t%d\t%d\t%d\t%d\n", i + 1, process[i].arrival_t, support[i], process[i].wait_t, process[i].turn_around_t);
    }
    printf("Avg Waiting Time: %f\n", Avg_WT);
    printf("Avg Turn Around Time: %f\n", Avg_TAT);
}

// Get input from user...
void input()
{
    printf("Enter the number of the Process: ");
    scanf("%d", &n);
    printf("Enter the Arrival time and Burst time of the Process\n");
    printf("AT BT\n");

    for (int i = 0; i < n; i++)
    {
        scanf("%d%d", &process[i].arrival_t, &process[i].burst_t);

        // copying the burst time in temperory variable...
        support[i] = process[i].burst_t;
    }
int quantum;
    printf("\nEnter Time Quantum: ");
    scanf("%d", &quantum);
}
int main()
{

    input();
    rr();
    display();
    return 0;
}