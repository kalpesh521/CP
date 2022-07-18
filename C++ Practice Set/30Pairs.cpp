#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    pair<int, string> p;
    // p=make_pair(2,"KPP");   // Method 1
    p = {1, "kp"};             // Method 2
    cout << p.first << " " << p.second << endl;
    pair<int, string> &p1 = p;
    p1.first = 6;
    cout << p.first << " " << p.second << endl;
    return 0;
}
