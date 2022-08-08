#include <bits/stdc++.h>
using namespace std;

void fun1(int n)
{
    if (n > 0)
    {
        fun1(n - 1);
        cout << n << " ";
    }
}
//int x=0; // Global Variable
int fun2(int n)
{   static int x=0;
    if (n > 0)
    {   x++;
        return fun2(n - 1) + x;
    }
    return 0;
}
int main(int argc, char const *argv[])
{

    int x = 5;
    int y = 5;
    fun1(x);
    cout << endl;
    cout << fun2(y);
    return 0;
}