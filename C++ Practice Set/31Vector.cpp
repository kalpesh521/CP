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
    // Vector 1
    vector<int> vec1; // zero element length vector
    int element, size = 5;
    cout << "Enter size of vector" << endl;
    cin >> size;

    for (int i = 0; i < size; i++)
    {
        cout << "Element is"
             << " ";
        cin >> element;
        vec1.push_back(element); // Add element at end
    }

    / vec1.pop_back(); // Delete element at last
    display(vec1);

    vector<int>::iterator iter = vec1.begin(); // Replace by auto keyword
    vec1.insert(iter + 1, 5, 566);             // 5-> 5 copies

    vector<char> vec2(4); // 4 element  length vector
    vec2.push_back('8');
    // vec2.push_back('8');
    //  display(vec2);

    vector<char> vec3(vec2); // 4th element vector derived from vec2
    display(vec3);

    vector<int> vec4(6, 2); // Display 6 elements of 2;
    display(vec4);

    vector<pair<int, int>> vec = {{3, 4}, {2, 6}, {1, 8}};
    vector<pair<int, int>>::iterator it;
    for (it = vec.begin(); it != vec.end(); ++it)
    {
        cout << (*it).first << (*it).second << endl;//Method 1
    }
    for (it = vec.begin(); it != vec.end(); ++it)
    {
        cout << (it->first) << (it->second) << endl;//Method 2
    }

    return 0;
}
