#include <iostream>
using namespace std;

void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

// Swap pointer method
// Call by reference using pointers
void swappointer(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Call by reference using reference variable
void swapreference(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int x = 4;
    int y = 5;
    cout << "the value of x is " << x << " the value of y is " << y << endl;
    swap(x, y); // This will not swap x and y
    //cout << "the value of x is " << x << " the value of y is " << y << endl;
    swappointer(&x, &y); // This will  swap x and y using pointer
    cout<< "the value of x is " << x << " the value of y is " << y << endl;
    swapreference(x, y); // This will  swap x and y using reference variable
    cout << "the value of x is " << x << " the value of y is " << y << endl;
    return 0;
}
