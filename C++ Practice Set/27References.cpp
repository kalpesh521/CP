#include <iostream>
using namespace std;//create same value a reference to r...a=r
int main(int argc, char const *argv[])
{
     int a=10;
     int &r=a;
     cout<<a<<endl;
     r++;
     cout<<r<<endl;
     cout<<a<<endl;
     r--;
    cout<<r<<endl;
    cout<<a<<endl;

    return 0;
}
