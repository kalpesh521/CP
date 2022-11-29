#include <iostream>
#include <cmath>
#include <math.h>
using namespace std; // std means standard

// int : integer  main:entry point main function (parenthesis
int main()
{

    /*int n;
    cin >> n;
    bool flag = 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if ((n % i) == 0)
        {
            cout << "not prime" << endl;
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        cout << "Prime" << endl;
    }*/

    /*int n;
    cin >> n;
    int reverse = 0;
    while (n > 0)
    {
        int lastdigit = n % 10; // 455/10= 45.5
        reverse = reverse * 10 + lastdigit;
        n = n / 10;
    }
    cout << reverse << endl;*/

    int n;
    cin >> n;
    int sum = 0;
    int orgn = n;

    while (n > 0)
    {

        int lastdigit = n % 10;
        sum += pow(lastdigit, 3);
        n = n / 10;
    }
    if (sum == orgn)
    {
        cout << "It is Armastrong number" << endl;
    }
    else
    {
        cout << "Not Armstrong number" << endl;
    }
    return 0;
}
// write  cpp program for addition of two numbers?      
void
a= 10 ;

