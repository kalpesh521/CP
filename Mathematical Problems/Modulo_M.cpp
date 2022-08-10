#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cin >> n;
    int fact = 1;
    int M = 47;
    for (int i = 2; i <= n; ++i)
    {
        fact = (fact * i) % M;
    }
    cout << fact << endl;
    return 0;
}