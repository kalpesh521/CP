#include <bits/stdc++.h>
using namespace std;

int fact(int n)
{
    if (n == 0)
    {
        return 1;
    }
    else
    {
        return fact(n - 1) * n;
    }
}

int Ifact(int m)
{
    int f = 1;
    int i;
    for (i = 1; i <= m; i++)
    {
        f = f * i;
    }
    return f;
}
int main(int argc, char const *argv[])
{
    cout << fact(5);
    cout << endl;
    cout << Ifact(5);
    return 0;
}
