#include <bits/stdc++.h>
using namespace std;
/*
2^5 = (2*2*2*2)*2
      2^(4)*2
      m^(n-1)*m
*/
int exp(int m, int n)
{
    if (n == 0)
    {
        return 1;
    }
    return exp(m, n - 1) * m;
}

//Power Function
int power(int m, int n)
{
    if (n == 0)
        return 1;
    if (n % 2 == 0)
        return power(m * m, n /2);
    return m * power(m * m, (n - 1) / 2);
}
int main(int argc, char const *argv[])
{
    cout << exp(2, 3);
    cout<<endl;
    cout << power(2, 3);
    return 0;
}