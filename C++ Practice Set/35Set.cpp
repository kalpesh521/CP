#include <bits/stdc++.h>
#include <set>
using namespace std;
void print_set(unordered_set<string> &s)
{
    for (string value : s)
    {
        cout << value << endl;
    }
}
int main(int argc, char const *argv[])
{ // Ordered Output
    // Store Unique Elements
    /*set<string> s;
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
*/
    // Ordered Set
    /* set<string> s;
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
 */
    // Unordered Set

    unordered_set<string> s;
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
    int q;
    cout<<"Enter Size Of q"<<endl;
    cin >> q;
    while (q--)
    {
        string str;
        cout<<"Enter String"<<endl;
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
    return 0;
}
