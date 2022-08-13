
#include <bits/stdc++.h>
using namespace std;

class Diagonal
{
private:
    int *A;
    int n;

public:
    Diagonal()
    {
        n = 2;
        A = new int[2];
    }
    Diagonal(int n)
    {
        this->n = n;
        A = new int[n];
    }
    ~Diagonal()
    {
        delete[] A;
    }
    void Set(int i, int j, int x);
    int Get(int i, int j);
    void Display();
    int GetDimension() { return n; }
};
void Diagonal::Set(int i, int j, int x)
{
    if (i == j)
        A[i - 1] = x;
}
int Diagonal::Get(int i, int j)
{
    if (i == j)
        return A[i - 1];
    return 0;
}
void Diagonal::Display()
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == j)
                cout << A[i - 1] << " ";
            else
                cout << "0 ";
        }
        cout << endl;
    }
}

int main()
{

    Diagonal dm(4);
    int x;

    dm.Set(1, 1, 4);
    dm.Set(2, 2, 8);
    dm.Set(3, 3, 7);
    dm.Set(4, 4, 14);

    dm.Display();
    cout << endl;

    cout<<dm.Get(1, 1);
    cout << endl;
    cout<<dm.Get(2, 1);
    return 0;
}