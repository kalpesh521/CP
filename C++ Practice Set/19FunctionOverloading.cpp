#include <iostream>
using namespace std;

int sum(int a, int b)
{

    return a + b;
}

int sum(int a, int b, int c)
{

    return a + b + c;
}

int volume(int a)
{

    return a * a * a;
}
int main()
{
    //int a,  b;
    cout << "the sum of a and b is " << sum(2, 3) << endl;
    cout << "the sum of a and b is " << sum(2, 3, 5) << endl;
    cout << "the volume of cube  is " << volume(5) << endl;
    return 0;
}
