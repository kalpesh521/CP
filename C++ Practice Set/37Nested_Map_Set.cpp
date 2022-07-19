#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    map<pair<string, string>, vector<int>> m;
    int n;
    cout<<"Enter n"<<endl;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string fn, ln;
        int ct;
        cout<<"Enter nf ln ct"<<endl;
        cin >> fn >> ln >> ct;
        for (int j = 0; j < ct; ++j)
        {
            int x;
            cout<<"Enter x"<<endl;
            cin >> x;
            m[{fn, ln}].push_back(x);
        }
    }
    for (auto &pr : m)
    {
        auto &firstname = pr.first;
        auto &list = pr.second;
        cout << firstname.first << " " << firstname.second << endl;
        cout << list.size() << endl;
    }

    return 0;
}
