#include <bits/stdc++.h>
#include <map>
using namespace std;
int main(int argc, char const *argv[])
{//time complexity O(1)
// Output in unsorted format
    unordered_map<string, int> m;
    int n;
    cout<<" Size"<<endl;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string s;
        cout<<"String"<<endl;
        cin>>s;
        m[s]++;
    }
for ( auto &v:m)
{
    cout<<v.first<<" "<<v.second<<endl;
}

    return 0;
}
