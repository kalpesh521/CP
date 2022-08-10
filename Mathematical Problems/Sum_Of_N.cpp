#include <bits/stdc++.h>
using namespace std;

int sum(int n)
{
    return n * (n + 1) / 2; // O(n)
}

int rec_sum(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else
    {
        return sum(n - 1) + n;
    }
}
int main(int argc, char const *argv[])
{

    cout << sum(10);
    cout << endl;
    int sum = 0;
    int n = 10;
    for (int i = 1; i <= n; i++) // O(n)
    {
        sum = sum + i;
    }
    cout << sum;

    cout << endl;
    cout << rec_sum(10);
    return 0;
}