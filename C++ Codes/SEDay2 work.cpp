
#include <iostream>  //header files i/p and o/p
using namespace std; // std means standard

//structure
struct person
{
    char name[50];
    int age;
    float salary;
};

int main()
{
    person p1;
    cout << "Enter Full Name" << endl;
    cin >> p1.name;
    cout << "Enter  age" << endl;
    cin >> p1.age;
    cout << "Enter  salary" << endl;
    cin >> p1.salary;

    cout << " while Displaying information" << endl;
    cout << "Name :" << p1.name << endl;
    cout << "Age" << p1.age << endl;
    cout << "Salary" << p1.salary << endl;

    /*int arr[5]={1,4,8,5,3};
    for( int i = 0; i <=4 ; i++)
    {
        cout<<arr[5]<<endl; 
    }*/

    return 0;
}
