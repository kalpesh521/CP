#include <bits/stdc++.h>
using namespace std;

int sum(int *a, int *b)
{
    int ans = *a + *b;
    cout << "a + b = " << ans << endl;
}
int main(int argc, char const *argv[])
{
    int n=1000;
    int a, b;

    for (int i = 0; i <= n; i++)
    {
        if ((a & b) > 0)
        {
            cin >> a;
            cin >> b;
            sum(&a, &b) ;
            cout << "\n";
        }
        else
        {
            cout << "Enter Positive number";
            break;
        }
     }

    return 0;
}
