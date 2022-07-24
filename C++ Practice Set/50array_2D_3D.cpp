#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{

    int A[3][4] = {{2, 4, 5, 7}, {4, 7, 8, 9}, {1, 23, 4, 5}};
    int *B[3];
    int **C;

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            cout << B[i][j] << " ";
        }
        cout << endl;
    }
        cout << endl;

     B[0] = new int[4];
    B[1] = new int[4];
     B[2] = new int[4];

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            cout << A[i][j] << " ";
        }
        cout << endl;
    }

            cout << endl;

    C = new int *[3];
    C[0] = new int[4];
    C[1] = new int[4];
    C[2] = new int[4];
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            cout << C[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}