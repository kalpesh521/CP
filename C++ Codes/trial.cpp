#include <bits/stdc++.h>
using namespace std;
int max(int a, int b)
{
    return (a > b) ? a : b;
}

int knapsack(int M, int wt[], int val[], int n)
{
    int k[n + 1][M + 1];
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= M; j++)
        {
            if (i == 0 || j == 0)
            {
                k[i][j] = 0;
            }
            else if (wt[i] <= j)
            {
                k[i][j] = max(k[i - 1][j], val[i] + k[i- 1][j - wt[i]]);
            }
            else
            {
                k[i][j] = k[i - 1][j];
            }
        }
    }
    return k[n][M];
}

int main()
{
    int n;
    cout << "Enter size";
    cin >> n;
    int val[n];
    int wt[n];
    cout << "\n Enter profit \t Enter Weight \n";
    for (int i = 0; i < n; i++)
    {
        cin >> val[i] >> wt[i];
        cout << endl;
    }
    int M;
    cout << " Enter knapsack size";
    cin >> M;
    cout << knapsack(M, wt, val, n);
    return 0;
}