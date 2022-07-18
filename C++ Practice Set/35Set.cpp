#include <bits/stdc++.h>
#include <set>
using namespace std;
void print_set(set<string> &s)
{
    for (string value : s)
    {
        cout << value << endl;
    }
}
int main(int argc, char const *argv[])
{   // Ordered Output
    // Store Unique Elements
    set<string> s;
    s.insert("abv"); // log(n)
    s.insert("tre");
    s.insert("ert");
    auto it = s.find("abv");
    if (it != s.end())
    {
        // cout << *it << endl;
         s.erase(it) ;
    }
    print_set(s);

    return 0;
}
