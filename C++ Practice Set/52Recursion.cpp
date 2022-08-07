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

int fun2(int n){
    if (n>0)
    {
        return fun2(n-1)+n;
    }
    return 0;
}
int main(int argc, char const *argv[])
{

    int x = 5;
    int y = 5;
    fun1(x);
    cout<<endl;
    cout<<fun2(y);
    return 0;
}