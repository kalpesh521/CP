/*
Template
Template with multiple parameters
Template with default parameters
Function Templates
Function Overloading
*/

#include <iostream>
using namespace std;

template <typename T>
T mymax(T x, T y)
{
    return (x > y) ? x : y;
}
int main(int argc, char const *argv[])
{
    cout << mymax<int>(3, 4) << endl;
    cout << mymax<char>('s', 't') << endl;
    cout << mymax<int>(36, 6) << endl;
    return 0;
}

//======================================================================================================
// Template program
class vector
{
public:
    int *arr;
    int size;

    vector(int m) // Constructor
    {
        size = m;
        arr = new int[size];
    }

    int dotproduct(vector &v) // Function
    {
        int d = 0;
        for (int i = 0; i < size; i++)
        {
            d += this->arr[i] * v.arr[i];
        }
        return d;
    }
};
int main(int argc, char const *argv[])
{
    vector v1(3);
    v1.arr[0] = 4;
    v1.arr[1] = 5;
    v1.arr[2] = 6;
    vector v2(3);
    v2.arr[0] = 14;
    v2.arr[1] = 15;
    v2.arr[2] = 16;
    int a = v1.dotproduct(v2);
    cout << a << endl;
    return 0;
}

//======================================================================================================
// Template with Multiple parameters

template <class T1, class T2>
class myclass
{
public:
    T1 data1;
    T2 data2;
    myclass(T1 a, T2 b)
    {
        data1 = a;
        data2 = b;
    }
    void display()
    {
        cout << this->data1 << " " << this->data2 << endl;
    }
};
int main(int argc, char const *argv[])
{
    // myclass<int, char> obj(2, 'k');
    // myclass<int, float> obj(2, 10.2);
    myclass<int, bool> obj(2, true);
    obj.display();
    return 0;
}

//============================================================================================
// Template with default parameter
template <class T1 = int, class T2 = float, class T3 = char> // default Parameters
class myclass
{
public:
    T1 data1;
    T2 data2;
    T3 data3;
    myclass(T1 a, T2 b, T3 c)
    {
        data1 = a;
        data2 = b;
        data3 = c;
    }
    void display()
    {
        cout << this->data1 << " " << this->data2 << " " << this->data3 << endl;
    }
};
int main(int argc, char const *argv[])
{

    myclass<> obj(2, 10.2, 'k');
    obj.display();
    cout << endl;
    myclass<float, float, char> kp(2.2, 10.2, 's'); // default parameters
    kp.display();
    return 0;
}

//=========================================================================================
// Function templates
template <class T1, class T2>
float average(T1 a, T2 b)
{
    float avg = (a + b) / 2.0;
    return avg;
}
template <class T>
void swapp(T &a, T &b)
{
    T temp = a;
    a = b;
    b = temp;
}
int main()
{
    // Find Average using templates
    float a;
    a = average(5.2, 3.6);
    cout << a << endl;

    // Swap using templates
    int x = 3, y = 2;
    cout << "Before Swapping " << x << " " << y << endl;
    swapp(x, y);
    cout << "After Swapping " << x << " " << y << endl;
}