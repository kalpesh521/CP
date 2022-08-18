#include <bits/stdc++.h>
#include <forward_list>

using namespace std;
int main(int argc, char const *argv[])
{
    // Forward_list -> Single linkdelist >> Only Forward Traversal(Points to next elemnet)
    forward_list<int> fl1;
    forward_list<int> fl2;
    forward_list<int> fl3;

    fl1.assign({1, 2, 3, 4, 5});
    fl2.assign(4, 5);
    fl3.assign(fl1.begin(), fl1.end());
    cout << endl;

    for (auto val : fl1)
    {
        cout << val << " ";
    }
    cout << endl;

    for (auto val : fl2)
    {
        cout << val << " ";
    }
    cout << endl;
    for (auto val : fl3)
    {
        cout << val << " ";
    }
    cout << endl;
    fl2.splice_after(fl2.begin(), fl1);
    for (auto val : fl2)
    {
        cout << val << " ";
    }
    return 0;
}