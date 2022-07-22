#include <bits/stdc++.h>
using namespace std;
#include <vector>
int main(int argc, char const *argv[])
{
    int n;
    cin >> n;
   // int a[n];
    vector<int> a(n);
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i];
    }
   // sort(a, a + n);
    //sort(a+2, a + n);
    //sort(a, a + 3);
    sort(a.begin(),a.end());
    //Intro Sort => Quick Sort ,Heap Sort and Insertion sort 
    cout << "Sorted array is :" << endl;

    for (int i = 0; i < n; ++i)
    {
        cout << a[i] << endl;
    }
    cout << endl;
    return 0;
}
