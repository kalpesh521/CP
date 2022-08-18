#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    /*
        int A[5] = {2, 4, 7, 8, 5};//Stack Memory Allocation
        int *p;
        for (int i = 0; i < 5; i++)
        {
            cout << A[i] << endl;
            ;
        }

        cout << endl;
        p = new int[5];//Heap Memory Allocation by using pointers

        p[0] = 2;
        p[1] = 12;
        p[2] = 21;
        p[3] = 22;
        p[4] = 32;
        for (int i = 0; i < 5; i++)
        {
            cout << p[i] << endl;
        }
    */

    // Increase Size of an array

    int *p;
    int *q;
    p = new int[5];

    p[0] = 2;
    p[1] = 72;
    p[2] = 28;
    p[3] = 24;
    p[4] = 12;
    q = new int[10];

    for (int i = 0; i < 5; i++)
    {
        q[i] = p[i]; // Copy of pointer array
    }
    delete[] p; // delete p
    p = q;
    q = NULL;

    for (int i = 0; i < 5; i++)
    {
        cout << p[i] << endl;
    }

    return 0;
}