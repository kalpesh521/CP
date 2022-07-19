#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cout << " Enter number of test cases";
    cin >> t;
    while (t--)
    {
        multiset<long long> bags;
        int n, k;
        cout << "Enter number of bags and time " ;
        cin >> n >> k;
        for (int i = 0; i < n; ++i)

        {
            int candy;
            cin >> candy;
            bags.insert(candy);
        }
        int total_candies = 0;

        for (int i = 0; i < k; ++i)
        {
            auto last_it = (--bags.end());
            int candy = *last_it;
            total_candies += candy;
            bags.erase(last_it);
            bags.insert(candy/2);
        }
        cout << total_candies << endl;
    }
    return 0;
}
