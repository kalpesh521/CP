#include <bits/stdc++.h>
#include <vector>

using namespace std;
template <class T>

void display(vector<T> &v)
{
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << " "; // v.at(i) can be used instead of v[i].
    }
    cout << endl;
}
int main(int argc, char const *argv[])
{
    vector<int> vec1;
    int element, size = 5;
    // cout << "Enter size of vector" << endl;
    // cin >> size;
    // for (int i = 0; i < size; i++)
    // {
    //     cout << "Element is"
    //          << " ";
    //     cin >> element;
    //     vec1.push_back(element); // Add element at end
    // }
    // vec1.pop_back(); // Delete element at last
    // display(vec1);
    // vector<int>::iterator iter = vec1.begin();
    // vec1.insert(iter + 1, 5, 566); // 5-> 5 copies

    vector<char> vec2(5);
    vec2.push_back('8');
    // vec2.push_back('8');
    //  display(vec2);

    vector<char> vec3(vec2);
    display(vec3);
    vector<int> vec4(6, 2);
    display(vec4);

    //

    return 0;
}
