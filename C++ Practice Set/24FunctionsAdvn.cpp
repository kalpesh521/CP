#include <iostream>
using namespace std;
// find  sum of n natuaral numbers
int sum(int *n){
    int ans=0;
    for ( int i = 0; i <=*n; i++)
    {
         ans+=i;
    }
    return ans;
}

/*int check(int x, int y, int z)
{
    int a = max(x, max(y, z));
    int b, c;
    if (a == x)
    {
        b = y;
        c = z;
    }
    else if (a == y)
    {
        b == x;
        c = z;
    }
    else
    {
        b = x;
        c = y;
    }

    if (a * a == b * b + c * c)
    {
        return true;
    }
    else
    {
        return false;
    }
}*/
int main(int argc, char const *argv[])
{
    int n;
    cin>>n;
    cout<<sum(&n)<<endl;
/*
    int x, y, z;
    cin >> x >> y >> z;
    if (check(x, y, z))
    {
        cout << "Pythagoraean triplet";
    }
    else
    {
        cout << "Not a Pythagorean Triplet";
    }
*/
    return 0;
}
