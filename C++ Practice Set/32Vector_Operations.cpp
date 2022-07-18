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

void print_pair(vector<pair<int, int>> v4)
{
    for (int i = 0; i < v4.size(); ++i)
    {
        cout << v4[i].first << " " << v4[i].second << endl;
    }
}
int main(int argc, char const *argv[])
{
    /* // Initialization of Vectors
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

     // Vector reference and copy

     vector<int> v2;
     v2.push_back(4);
     v2.push_back(7);
     print_v(v2);

     vector<int> v3 = v2;  // It will print only vector equal to v2 and additional
                           // push_back values
     vector<int> &v3 = v2; // It will print updated vector  by using reference
     v2.push_back(1);
     print_v(v2);
     v3.push_back(9);
     print_v(v3);

     vector<pair<int,int>> v4={{1,2},{4,5},{5,7}};
     print_pair(v4);

    vector<pair<int, int>> v5;
    int n;
    cout << "Enter size :" << endl;
    cin >> n ;
    for (int i = 0; i < n; ++i)
    {
        int x, y;
        cout << "Enter x and y" <<endl;
        cin >> x >> y;
        v5.push_back({x, y});
    }
    cout << endl;
    cout<<"Display Vector Pairs : "<<endl;
    print_pair(v5);
*/

    // Array of Vectors
    int N;
    cout << "N" << endl;
    cin >> N;
    vector<int> v5[N];

    for (int i = 0; i < N; ++i)
    {
        int n;
        cout << "n" << endl;
        cin >> n;
        for (int j = 0; j < n; ++j)
        {
            int x;
            cout << "X" << endl;
            cin >> x;
            v5[i].push_back(x);
        }
        cout << " Display Vector " << endl;
        for (int i = 0; i < N; ++i)
        {
            print_v(v5[i]);
        }
        

    }
    cout<<v5[0] [1]<<endl;

    return 0;
}
