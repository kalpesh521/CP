#include <iostream>
#include <vector>
using namespace std;

void print_v(vector<int> &v2)
{

    for (int i = 0; i < v2.size(); ++i)
    {
        cout << v2[i] << " ";
    }
    cout << endl;
}
int main(int argc, char const *argv[])
{
    /*// Initialization of Vectors
    vector<int> v = {4, 8, 7, 9, 6};
    for (int i = 0; i < v.size(); ++i)
    {
        cout << v[i] << " ";
    }
    cout << endl;

    vector<int> v1;
    for (int i = 1; i <= 5; i++)
    {
        v1.push_back(i);
    }

    for (auto i = v1.begin(); i != v1.end(); ++i)
    {
        cout << *i << " ";
    }
    cout << endl;

    for (int value : v1)
    {
        cout << value << " "; // It will make copy of vector
    }
    cout << endl;
    for (int &value : v1) // By including reference& ,we can get dynamic values
    {
        value++;
        cout << value << " ";
    }
    cout << endl;
    for (int value : v1)
    {
        cout << value << " ";
    }
    cout << endl;
    */
    // Vector reference and copy

    vector<int> v2;
    v2.push_back(4);
    v2.push_back(7);
    print_v(v2);

    vector<int> v3 =v2;
    v2.push_back(1);
    print_v(v2);
    v3.push_back(9);
    print_v(v3);
    return 0;
}
