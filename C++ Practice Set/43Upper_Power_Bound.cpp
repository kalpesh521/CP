#include <bits/stdc++.h>
using namespace std;
#include <vector>

int main(int argc, char const *argv[])
{ /*

 // Using array
 Lower Bound : returns itself if matches otherwise greater than that value from  sorted array
 Upper Bound : returns next greater value from sorted array
     int n;
     cin >> n;
     int a[n];
     for (int i = 0; i < n; ++i)
     {
         cin >> a[i];
     }
     sort(a, a + n);
     cout << "Sorted Array is" << endl;
     for (int i = 0; i < n; ++i)
     {
         cout << a[i] << endl;
     }

     int *ptr = lower_bound(a, a + n, 15);
     if (ptr == (a + n))
     {
         cout << "Not found" << endl;
         return 0;
     }

     cout <<"Lower Bound is "<< *ptr << endl;


    // Using Vector
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i];
    }
    sort(a.begin(), a.end());
    cout << "Sorted Array is" << endl;
    for (int i = 0; i < n; ++i)
    {
        cout << a[i] << endl;
    }

    // auto it = lower_bound(a.begin(), a.end(), 15);
    auto it = upper_bound(a.begin(), a.end(), 15);
    if (it == (a.end()))
    {
        cout << "Not found" << endl;
        return 0;
    }

    cout << "Lower Bound is " << *it << endl;*/
    int n;
    cin >> n;
    set<int> s;
    for (int i = 0; i < n; ++i)
    {
        int x;
        cin >> x;
        s.insert(x);
    }

    auto it = s.lower_bound(15);

    cout << *it << endl;
    return 0;
}
