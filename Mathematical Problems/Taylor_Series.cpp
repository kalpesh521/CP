#include <bits/stdc++.h>
using namespace std;

int e(int m, int n)
{
    static int p = 1, f = 1;
    int r;
    char x;
    if (n == 0)
    {
        return 1;
    }
    else
    {
        r = e(m, n - 1);
        p = p * x;
        f = f * n;
        return r + p / f;
    }
}
int main(int argc, char const *argv[])
{   cout<<e(2,3);
    return 0;
}