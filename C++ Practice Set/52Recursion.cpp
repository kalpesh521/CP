#include <bits/stdc++.h>
using namespace std;

void fun1(int n){
    if (n>0){
   fun1(n-1);
      cout<<n<<" ";

    }
}
int main(int argc, char const *argv[])
{

    int x =5;
    fun1(x);
 return 0;
} 