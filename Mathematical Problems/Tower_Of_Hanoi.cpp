#include <bits/stdc++.h>
using namespace std;

int TOC(int n,int A,int B,int C){
    if(n>0){
        TOC(n-1,A,C,B);
        
        cout<<A<<" "<<C;
        cout<<endl;
        TOC(n-1,B,A,C);
    }
}
int main(int argc, char const *argv[])
{
    cout<<TOC(3,1,2,3);
 return 0;
}