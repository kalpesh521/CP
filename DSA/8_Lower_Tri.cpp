
#include <bits/stdc++.h>
using namespace std;

class LowerTri
{
private:
    int *A;
    int n;

public:
    LowerTri()
    {
        n = 2;
        A = new int[2 * (2 + 1) / 2];
    }
    LowerTri(int n) // Parameterised Constructor
    {
        this->n = n;
        A = new int[n * (n + 1) / 2];
    }
    ~LowerTri() // Destructor
    {
        delete[] A;
    }
    void Set(int i, int j, int x);
    int Get(int i, int j);
    void Display();
    int GetDimension() { return n; }
};
void LowerTri::Set(int i, int j, int x)
{
    if (i >= j)
        A[i * (i - 1) / 2 + j - 1] = x;
}
int LowerTri::Get(int i, int j)
{
    if (i >= j)
        return A[i * (i - 1) / 2 + j - 1];
    return 0;
}
void LowerTri::Display()
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i >= j)
                cout << A[i * (i - 1) / 2 + j - 1] << " ";
            else
                cout << "0 ";
        }
        cout << endl;
    }
}

int main()
{

    int d;
    cout << "Enter Dimension" << endl;
    cin >> d;
    LowerTri lm(d);
    cout << "Enter Elements" << endl;
    int x;
    for (int i = 1; i <= d; i++)

    {
        for (int j = 1; j <= d; j++)
        {

            cin >> x;
            lm.Set(i, j, x);
        }
        cout << endl;
    }

    lm.Display();

    cout << lm.Get(1, 1);
    cout << endl;
    cout << lm.Get(2, 1);
    return 0;
}