
#include <bits/stdc++.h>
using namespace std;
#include <vector>
#include <numeric>
int main(int argc, char const *argv[])
{

    // Lambda function [](){}

    cout << [](int x, int y) { return x * y; }(3, 4)<< endl;

    auto sum = [](int x, int y){ return x + y; };
    cout << sum(2, 6)<<endl;

    // all_of,any_of and none_of

    vector<int> v = {-2, -5, -7};
    cout << "all of"<<all_of(v.begin(), v.end(), [](int x){ return x > 0; })<<endl;
    cout << "any of"<<any_of(v.begin(), v.end(), [](int x){ return x > 0; })<<endl;
    cout << "none of"<<none_of(v.begin(), v.end(), [](int x){ return x > 0; })<<endl;

    int arr[6]={0};
    iota(arr,arr+6,10);
    for ( int i = 0; i <  6; i++)
    {
         cout<<arr[i]<<endl;
    }
    
    return 0;
}