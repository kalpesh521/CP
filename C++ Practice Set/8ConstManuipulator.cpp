#include <iostream>
#include <iomanip>

using namespace std;
int main(int argc, char const *argv[])
{
    //Constants
    //const int a =5; //const keyword
    //cout<<a;

    // Manipulators
    //#include <iomanip>  apply header files
    //setw keyword for width

    /*int a = 3, b = 45, c = 6255, d = 58954;
    cout << "the value of a is " << a << endl;
    cout << "the value of b is " << b << endl;
    cout << "the value of c is " << c << endl;
    cout << "the value of d is " << d << endl;

    cout << "the value of a with setw is " << setw(5) << a << endl;
    cout << "the value of b with setw is " << setw(5) << b << endl;
    cout << "the value of c with setw is " << setw(5) << c << endl;
    cout << "the value of s with setw is " << setw(5) << d << endl;
    */

   //Opeartor Precedences
   //Source:cppreference.com
    
    int a=8,b=2;
    int c=(((a*5)+b)-9);
    cout<<c;
    return 0;
    
}
