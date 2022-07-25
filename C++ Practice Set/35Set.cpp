#include <bits/stdc++.h>
#include <set>
using namespace std;
void print_set(multiset<string> &s)
{
    for (string value : s)
    {
        cout << value << endl;
    }
}
int main(int argc, char const *argv[])
{ //======================================  Ordered Set ===================================

    // Ordered Output
    // Store Unique Elements
    // uses only keys
    set<string> s;
    s.insert("abv"); // log(n)
    s.insert("tre");
    s.insert("ert");
    auto it = s.find("ert");
    if (it != s.end())
    {
        // cout << *it << endl;
        s.erase(it);
    }
    print_set(s);

    set<string> s;
    int n;
    cout << "Enter Size" << endl;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string str;
        cout << "Enter String" << endl;
        cin >> str;
        s.insert(str);
    }
    cout << endl;
    cout << "Display set" << endl;
    print_set(s);

    //===============================  Unordered Set ==============================
    // Like hash tables/Functions
    unordered_set<string> s;
    int n;
    cout << "Enter Size" << endl;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string str;
        cout << "Enter String" << endl; // O(1)
        cin >> str;
        s.insert(str);
    }
    int q;
    cout << "Enter Size Of q" << endl;
    cin >> q;
    while (q--)
    {
        string str;
        cout << "Enter String" << endl;
        cin >> str;
        if (s.find(str) == s.end())
        {
            cout << "No" << endl;
        }
        else
        {
            cout << "Yes" << endl;
        }
    }
    cout << endl;
    cout << "Display set" << endl;
    print_set(s);

    // ================================ Multiset ===============================================
    // Contain duplicate Value
    multiset<string> s;
    s.insert("abc");
    s.insert("erc");
    s.insert("zbc");
    s.insert("abc");
    auto it = s.find("abc");
    if (it != s.end())
    {
        s.erase(it); // delete only one abc
    }

    s.erase("abc"); // Delete both abc
    print_set(s);

    return 0;
}
