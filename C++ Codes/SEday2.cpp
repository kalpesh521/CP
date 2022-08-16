#include <iostream>  //header files i/p and o/p
using namespace std; // std means standard

//structure
/*struct person
{
    char name[50];
    int age;
    float salary;
};*/

int main()
{
    /* person p1;
    cout << "Enter Full Name" << endl;
    cin >> p1.name;
    cout << "Enter  age" << endl;
    cin >> p1.age;
    cout << "Enter  salary" << endl;
    cin >> p1.salary;

    cout << " while Displaying information" << endl;
    cout << "Name :" << p1.name << endl;
    cout << "Age" << p1.age << endl;
    cout << "Salary" << p1.salary << endl;*/

    // Two  Dimensional Arrays
    int arr[5][2] = {{1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}};
    int i, j;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << "arr[" << i << "][" << j << "] = " << arr[i][j] << endl;
        }
    }

    // increament and decreament operator
    int k = 10;
    //cout<<k++<<endl;
    cout << k << endl;//10

    cout << ++k << endl;//11
    cout << --k << endl;//10
    cout << k-- << endl;//10
    cout << k++ << endl;//9
    cout << k++ << endl;//10
    cout << k-- << endl;//11
    cout << --k << endl;//9

    return 0;
}
