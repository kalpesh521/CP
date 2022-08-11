#include <bits/stdc++.h>

using namespace std;
//Recursive O(n)
double e(int x, int n)
{
    static double s = 1;
    if (n == 0)
    {
        return s;
    }
    s = 1 + x * s / n;
    return e(x, n - 1);
}
//Iterative O(n)
double Ie(int x, int n)
{
    double s = 1;
    int i;
    double num = 1;
    double dem = 1;
    for (int i = 1; i <= n; i++)
    {
        num *= x;
        dem *= i;
        s += num / dem;
    }
    return s;
}
int main(int argc, char const *argv[])
{
    cout << e(2, 10);
    cout << endl;
    cout << Ie(2, 10);
    return 0;
}