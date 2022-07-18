#include <bits/stdc++.h>
#include <map>

using namespace std;

void print_map(map<string, int> &m1)
{
    // map <int, string > ::iterator it;
    // for (it = m.begin(); it != m.end(); ++it)
    // {
    //     cout << (it->first) << " " << (it->second) << endl;
    // }
    for (auto &v : m1) // O(nlog(n))
    {
        cout << v.first << " " << v.second << endl;
    }
}
int main(int argc, char const *argv[])
{ // Red Black  trees
    map<int, string> m;
    m[1] = "kp"; // O(log(n))
    m[3] = "sp";
    m[2] = "pp";
    m[6] = "lp";
    m.insert({5, "RR"});
    auto it = m.find(8);
    if (it == m.end())
    {
        cout << " No Value";
    }
    else
    {
        cout << (it->first) << " " << (it->second) << endl;
    }

    m.erase(3);
    if (it != m.end())
    {
        cout << " Not Found";
    }
    else
    {
        m.erase(it);
    }
    print_map(m);

    // Problem

    map<string, int> m1;
    int n;
    cout << "Enter size :" << endl;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string s;
        cout << "Input string" << endl;
        cin >> s;
        m1[s]++;
    }
    cout << "Display Unique strings in lexiogrphical Order" << endl;
    print_map(m1);
    return 0;
}
