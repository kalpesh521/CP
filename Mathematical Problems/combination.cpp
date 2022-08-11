#include <bits/stdc++.h>
using namespace std;
int fact(int n){
    if (n==0)
    return 1;
    return fact(n-1)*n;
}
int nCr(int n,int r){
     int num =fact(n);
     int dem =fact(r)*(n-r);
     int c=num/dem;
     return c;
}
int main(int argc, char const *argv[])
{ 
    
     cout<<nCr(4,2);
 return 0;
}