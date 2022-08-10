#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    cout << INT_MAX << endl; // 2147483647
    cout << INT_MIN << endl; //-2147483647

    int a = (1 << 32) - 1;   // Left shift width greter than width type(Overflow)
    int b = (1LL << 31) - 1; // 2147483647 =INT_MAX
    cout << b << endl;
    unsigned int c = (1LL << 32) - 1; // Print the value because it is unsigned
    // Signned value contain one bit so,it become overflow .
    cout << c << endl;
    return 0;
}