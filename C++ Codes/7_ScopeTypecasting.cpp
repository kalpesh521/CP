
#include <iostream>
using namespace std;
int c = 25; // global
int main()
{
    /*int  a, b, c;

    cout << "Enter value of num1: ";
    cin >> a;

    cout << "Enter value of num2: ";
    cin >>  b;
   
    cout << "value of c is "  << a+b << endl;
    cout << "value of c is "  << c << endl;
    cout << "value of c is "  << ::c << endl; //Scope resolution operator 
    
    float d =23.5f;//floating point value l &L are valid 
    long double e= 23.5l;//long double value  l &L are valid
    cout << "value of d is "  << d << endl<<"value of e is "<<e<<endl;
    cout << " The size of 23.5 is "  <<sizeof(23.5) << endl; //double by default
    cout << " The size of 23.5 is "  <<sizeof(23.5f) << endl;
    cout << " The size of 23.5 is "  <<sizeof(23.5F) << endl;
    cout << " The size of 23.5 is "  <<sizeof(23.5l) << endl;
    cout << " The size of 23.5 is "  <<sizeof(23.5L) << endl;

// Referance variable

    //value of variable will be same for all x,y,z and more 
    float x = 25;
    float &y=x;
    float &z=x;
    cout<<"Value of x is "<<x<<endl; 
    cout<<"Value of y is "<<y<<endl; 
    cout<<"Value of z is "<<z<<endl; */

    // Typecasting

    int a = 45;
    float b = 85.99;
    cout << " the value  of a is " << float(a) << endl; //int to float
    cout << " the value  of a is " << (float)a << endl; //int to float
    cout << " the value  of b is " << int(b) << endl;   // float to int
    cout << " the value  of b is " << (int)b << endl;   // float to int

    int c = int(b);

    cout << " the value  of expresion  is " << a + b << endl;
    cout << " the value  of expresion  is " << a + (int)b << endl;
    cout << " the value  of expresion  is " << a + int(b) << endl;

    return 0;
}