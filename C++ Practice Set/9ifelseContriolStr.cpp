

#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int age;
    cout << "Enter your age" << endl;
    cin >> age;
   /* if (age < 18)
    {

        cout << "You can't vote" << endl;
    }
    else if (age >= 18 & age <= 80)
    {
        cout << "You can vote" << endl;
    }
    else
    {
        cout << "You are invalid" << endl;
    }*/

    switch (age)
    {
    case 18 :
         cout << "Your age is 18" << endl;
        break;
    case 25 :
         cout << "Your age is greater than 18" << endl;
        break;

    default:
        cout << "there is no special cases" << endl;
        break;
    }
    return 0;
}
