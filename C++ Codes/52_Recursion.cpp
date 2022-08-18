#include <bits/stdc++.h>
using namespace std;

// Head Recursion
void fun1(int n)
{
    if (n > 0)
    {
        fun1(n - 1);
        cout << n << " ";
    }
}

// Tail Recursion
void fun2(int n)
{
    if (n > 0)
    {

        cout << n << " ";
        fun2(n - 1);
    }
}

// int x=0; // Global Variable
int fun3(int n)
{
    static int x = 0; // Static Variable
    if (n > 0)
    {
        x++;
        return fun3(n - 1) + x;
    }
    return 0;
}

// Tree Recursion
void fun4(int n)
{
    if (n > 0)
    {
        cout << n << " ";
        fun4(n - 1);
        fun4(n - 1);
    }
}

//Indirect Recursion
void funB(int n);
void funA(int n)
{
    if (n > 0)
    {
        cout << n << " ";
        funB(n - 1);
    }
}
void funB(int n)
{
    if (n > 1)
    {
        cout << n << " ";
        funA(n / 2);
    }
}

//Nested recursion
int fun5(int n){
    if(n>100){
        return n-10;
    }else{
        return fun5(fun5(n+11));
    }
}
int main(int argc, char const *argv[])
{

    int x = 3;
    int y = 3;
    fun1(x);
    cout << endl;
    fun2(x);
    cout << endl;
    cout << fun3(y);
    cout << endl;
    fun4(x);
    cout << endl;
    funA(20);
    cout<<endl;
    cout<<fun5(95);
    return 0;
}