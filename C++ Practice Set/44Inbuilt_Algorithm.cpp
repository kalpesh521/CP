#include <bits/stdc++.h>
#include <vector>
using namespace std;
int main()
{
    int n;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> v[i];
    }
    int min = *min_element(v.begin(), v.end());
    cout << min;
    int max = *max_element(v.begin(), v.end());
    cout << max;
    int sum = accumulate(v.begin(), v.end(), 0);
    cout << sum << endl;
    int ct = count(v.begin(), v.end(), 3);
    cout << ct << endl;

    auto it = find(v.begin(), v.end(), 3);
    if (it != v.end())
    {
        cout << *it << endl;
    }
    else
    {
        cout << "Element Not Found" << endl;
    }
    reverse(v.begin(), v.end());
    for (auto val : v)
    {
        cout << val << endl;
    }

    string s = "kalpesh";
    reverse(s.begin(), s.end());
    cout << s << endl;

    vector<int> v1 = {1, 2, 3, 5, 7};

    cout << binary_search(v1.begin(), v1.end(), 3) << endl; // Output 1
    cout << binary_search(v1.begin(), v1.end(), 6) << endl; // Output 0

    sort(v1.begin(), v1.end(), greater<int>()); // Sort in descending order
    for (auto val : v1)
    {
        cout << val << endl;
    }

    vector<string> v2 = {"s", "kp", "kpp", "sp"};
    for (auto val : v2) // String sort by alphabetical order and string length
    {
        cout << val << endl;
    }
    return 0;
}