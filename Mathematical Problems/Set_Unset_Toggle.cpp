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
{ /*
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
     printBit(a ^ (1 << 3));

     // Count set bits
     cout << __builtin_popcount(a); //For int
     cout << __builtin_popcountll(a); //For long long


   //Print the 8-bit binary number is odd or even
     for (int i = 0; i < 8; i++)
     {
         printBit(i);
         if (i & 1)
         {
             cout << "Odd" << endl;
         }
         else
         {
             cout << "Even" << endl;
         }
     }
    // Divide /Multiply by 2
    int n=5;
    cout<<(n<<1)<<endl;//Left shift multiply by 2
    cout<<(n>>1)<<endl;//Right shift divide by two
     return 0;
 */

    // Uppercase to lowercase unset(0) in uppercase

    cout << char(1 << 5) << endl;
    printBit(int('_'));
    char A = 'A'; // Method 1
    char a = A | ' ';
    cout << a << endl;

    char B = 'B'; // Method 2
    char b = B | (1 << 5);
    cout << b << endl;

    // Lowercase to uppercase 5th bit set(1) in lowercase

    char s = 's'; // Method 1
    char S = (s & '_');
    cout << S << endl;

    char k = 'k'; // Method 2
    char K = (k & (~(1 << 5)));
    cout << K << endl;

    // Clear LSB

    cout << "Binary of 59" << endl;
    printBit(59); // 000111011 ...> 11100000(~) ...>00011111 -1 ==>000100000 <Ans
    int m = 59;
    int i = 4;
    cout << "clear LSB" << endl;
    printBit(m & (~((1 << (i + 1)) - 1)));
    int n = 59;
    int j = 3;
    cout << "clear MSB" << endl;

    printBit(m & ((1 << (i + 1)) - 1));

    // Check power of 2

    //int l = 15;
    int l = 16;
    if (l & (l - 1))
    {
        cout << "Not power of 2" << endl;
    }
    else
    {
        cout << "Power of 2" << endl;
    }
}