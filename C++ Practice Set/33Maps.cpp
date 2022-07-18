#include <bits/stdc++.h>
#include <map>

using namespace std;

void print_map(map<int, string> &m)
{
    // map <int, string > ::iterator it;
    // for (it = m.begin(); it != m.end(); ++it)
    // {
    //     cout << (it->first) << " " << (it->second) << endl;
    // }
    cout << "size : " << m.size() << endl;
    for (auto &v : m) // O(nlog(n))
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
    // if (it == m.end())
    // {
    //     cout << " No Value";
    // }
    // else
    // {
    //     cout << (it->first) << " " << (it->second) << endl;
    // }

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

    return 0;
}
