#include <iostream>
#include <vector>
using namespace std;
int main(int argc, char const *argv[])
{

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
        cout << value << " ";
    }
    cout << endl;
    for (int &value : v1)
    {
        value++;
        cout << value << " ";
    }
    cout << endl;
    for (int value : v1)
    {
        cout << value.third << " ";
    }
    cout << endl;

    return 0;
}
