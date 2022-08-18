#include <iostream>
using namespace std;
int main()
{
    int marks[] = {45, 49, 50, 33};
    for (int i = 0; i < 4; i++)
    {
        cout << "the marks in " << i << " is " << marks[i] << endl;
    }

    cout << "new modified marks list is below " << endl;
    marks[2] = 60;
    marks[0] = 40;
    for (int i = 0; i < 4; i++)
    {
        cout << "the marks in " << i << " is " << marks[i] << endl;
    }

    // Array pointer arithmatic

    cout << "Array pointer arithmatic" << endl;
    int *p = marks;
    cout << "the value of marks in 0 " << *p << endl;
    cout << "the value of marks in 1 " << *(p + 1) << endl;
    cout << "the value of marks in 2 " << *(p + 2) << endl;
    cout << "the value of marks in 3 " << *(p + 3) << endl;

    return 0;
}
