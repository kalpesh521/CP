#include <iostream>
using namespace std;
int main()
{

    int a = 25;
    int *b; // for value of address
    b = &a; // address
    // address of variable
    cout << "address of a is " << &a << endl;
    cout << "address of a is " << b << endl; // b= &a

    // * --> value of address
    cout << "The value at address of a is " << *b << endl; // pointer *b

    // pointer to pointer
    cout << "Poiner to Pointer " << endl;
    int **c = &b;
    cout << "address of b is " << &b << endl;
    cout << "address of b is " << c << endl;
    cout << "address of b is " << *c << endl;
    cout << "the value at address of b is " << **c << endl;

    return 0;
}
