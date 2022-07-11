#include <iostream>
using namespace std;
int swap(int *a, int *b)
{ // int pointer
    int temp = *a;
    *a = *b;
    *b = temp;
}
int main(int argc, char const *argv[])
{
    // pointers ==> A variable which holds the adddress of another variable
    /*int a=20;
    int *p;
    p=&a;// *p=a=Value(20)  ........ p=&a=address
    cout<<*p<<endl;
    cout<<p<<endl;
    a++;
    cout<<a<<endl;
    cout<<&a<<endl;*/

    /*char b='s';
    char*p;
    p=&b;
    cout<<*p<<endl;
    cout<<p<<endl;
    cout<<b<<endl;
*/

    // Pointer and Arrays
    //  Printing array using pointers
    int arr[] = {12, 46, 5};
    cout << arr << endl;
    cout << *arr << endl;
    cout << "====================" << endl;
    int *pntr = arr;
    for (int i = 0; i < 3; i++)
    {
        cout << *pntr << endl;
        ;
        pntr++;
    }
    cout << "Using arr" << endl;
    for (int i = 0; i < 3; i++)
    {
        cout << "====================" << endl;
        cout << (arr + i) << endl;
        cout << (*arr + i) << endl;
    }

    // Pointer to pointer
    /*int a=20;
    int *p,**q;
    p=&a;
    **q=&p;
    cout<<**q<<endl;
    cout<<*q<<endl;
    cout<<**q<<endl;
      */

    // Pointer to function (Call By reference)
    int a = 2, b = 4;
    swap(&a, &b); // Address
    cout << a << " " << b;
    return 0;
}
