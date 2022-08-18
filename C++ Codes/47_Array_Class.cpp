#include <bits/stdc++.h>
#include <array>
#include <tuple>
using namespace std;
int main(int argc, char const *argv[])
{
     array<int, 6> ar = {1, 3, 4, 5, 8, 9};
     array<int, 6> ar1 = {11, 35, 45, 85, 48, 59};

     // Accessing array elements using at
     for (int i = 0; i < 6; ++i)
     {
          cout << ar.at(i) << " ";
     }

     cout << endl;

     // Accessing array elements using get
     cout << get<1>(ar) << endl;
     cout << get<5>(ar) << endl;

     cout << ar.front() << endl;
     cout << ar.back() << endl;

     // Swapping two array
     cout << endl;
     cout << "Array before Swapping" << endl;

     for (int i = 0; i < 6; i++)
     {
          cout << ar[i] << " ";
     }
     cout << endl;
     for (int i = 0; i < 6; i++)
     {
          cout << ar1[i] << " ";
     }

     ar.swap(ar1);
     cout << endl;

     cout << "Array After Swapping" << endl;
     for (int i = 0; i < 6; i++)
     {
          cout << ar[i] << " ";
     }
     cout << endl;
     for (int i = 0; i < 6; i++)
     {
          cout << ar1[i] << " ";
     }

     return 0;
}