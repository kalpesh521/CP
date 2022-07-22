#include <bits/stdc++.h>
#include <vector>
using namespace std;

bool should_I_swap(int a, int b)
{
    if (a > b)
        return true;
    return false;
};

bool cmp(pair<int, int> a, pair<int, int> b)
{
    if (a.first != b.first)
    {
        return a.first < b.first;
    }
    return a.second > b.second;
}
int main()
{
    int n;
    cin >> n;
    vector<pair<int, int>> a(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i].first >> a[i].second;
    }

    //sort(a.begin(), a.end(), cmp);
    sort(a.begin(), a.end(), greater<pair<int,int>>());
    cout << "\n"
         << "Sort oF array : " << endl;
    for (int i = 0; i < n; ++i)
    {
        cout << a[i].first << " " << a[i].second << endl;
    }



    // int n;
    // cin >> n;
    // vector<int> a(n);
    // for (int i = 0; i < n; ++i)
    // {
    //     cin >> a[i];
    // }

    // for (int i = 0; i < n; ++i)
    // {
    //     for (int j = i + 1; j < n; ++j)
    //     {
    //         should_I_swap(a[i], a[j]);
    //         swap(a[i], a[j]);
    //     }
    // }
    // cout<<"\n"<<"Swap oF array : "<<endl;
    // for (int i = 0; i < n; ++i)
    // {
    //     cout << a[i] << endl;
    // }

    return 0;
}