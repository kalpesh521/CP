#include <bits/stdc++.h>
#include<unordered_map>
using namespace std;

string isBalanced(string s)
{
    unordered_map<char, int> symbols = {{'[', -1}, {'(', -2}, {'{', -3}, {']', 1}, {')', 2}, {'}', 3}};
    stack<char> st;
    for (char brackets : s)
    {
        if (symbols[brackets] < 0)
        {
            st.push(brackets);
        }
        else
        {

            if (st.empty())
                return "No";
            char top = st.top();
            st.pop();
            if (symbols[top] + symbols[brackets] != 0)
            {
                return "No";
            }
        }
    }
    if (st.empty())
        return "yes";
    return "No";
}
int main(int argc, char const *argv[])
{

    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        cout << isBalanced(s) << endl;
    }

    return 0;
}
