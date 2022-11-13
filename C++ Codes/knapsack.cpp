//Knapsack problem
#include <bits/stdc++.h>
using namespace std;
int max(int a, int b)
{
    return (a > b) ? a : b;
}
int knapSack(int M, int wt[], int val[], int n)
{
    int K[n + 1][M + 1];
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= M; j++)
        {
            if (i == 0 || j == 0)
                K[i][j] = 0;
            else if (wt[i] <= j)
                K[i][j] = max(K[i - 1][j], val[i] + K[i - 1][j - wt[i]]);
            else
                K[i][j] = K[i - 1][j];
        }
    }
    return K[n][M];
}
int main()
{
    int n;
    cout << "Enter size: ";
    cin >> n;
    int val[n];
    int wt[n];
    cout << "\nEnter Profit\tWeight:\n";
    for (int i = 0; i < n; i++)
    {
        cin >> val[i] >> wt[i];
        cout << endl;
    }
    int M;
    cout << "\nEnter knapsack size is";
    cin >> M;
    cout << knapSack(M, wt, val, n);
    return 0;
}
