#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cout << "Enter Number" << endl;
    cin >> n;
    while (n == 0)
    {
        cout << "Neither even or odd" << endl;
        break;
    }

    while (n > 0)
    {
        (n % 2 == 0 && n != 0) ? cout << n << " is even" : cout << n << " is odd";
         break;
    }
   
    return 0;
}
