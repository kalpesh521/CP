#include <iostream>
using namespace std;

class Employee
{
private://access specifiers
    int a, b, c;//data members

public:
    int d, e;
    //print >>getData()  void <<void
    //declaration of Memeber function  Inside  the class
    void setData(int a1, int b1, int c1); // Memeber Functions Declaration 
    void getData()
    {
        cout << "The value of a(private) is " << a << endl;
        cout << "The value of b(private) is " << b << endl;
        cout << "The value of c(private) is " << c << endl;
        cout << "The value of d(public) is " << d << endl;
        cout << "The value of e(public) is " << e << endl;
    }
};
//declaration of Memeber function  Outside the class using scope resolution operator

void Employee ::setData(int a1, int b1, int c1)
{

    a = a1;
    b = b1;
    c = c1;
}
int main()
{
    Employee ram;//Declaring an object of ClASS EMPLOYEE
    //ram.a =21; Error due to a is private
    ram.d = 23;//Accessing data Members
    ram.e = 55;
    ram.setData(1, 2, 4);//Accessing memeber functions
    ram.getData();

    return 0;
}
