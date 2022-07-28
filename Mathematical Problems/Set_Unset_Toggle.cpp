#include <bits/stdc++.h>
using namespace std;

int printBit(int num)
{
    for (int i = 8; i >= 0; --i)
    {
        cout << ((num >> i) & 1);
    }
    cout << endl;
}
int main(int argc, char const *argv[])
{
    printBit(9);
    int a = 9; // 1001
    int i = 3;

    // Check ith bit is set (1) or unset (0)
    if (a & (1 << i) != 0)
    {
        cout << "Set Bit " << endl;
    }
    else
    {
        cout << "Not set bit" << endl;
    }

    // Set Bit of ith position
    printBit(a | (1 << i));

    printBit(~a);        // tilda to reverse bits
    printBit(1 << 3);    // 00001000
    printBit(~(1 << 3)); // 11110111
    // Unset ith position

    printBit(a & ~(1 << i));

    // toggle
    printBit(a ^ (1<<3));

    //Count set bits 
    cout<<__builtin_popcount(a);
    return 0;
}