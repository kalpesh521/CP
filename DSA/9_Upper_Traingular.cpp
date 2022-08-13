
#include <bits/stdc++.h>
using namespace std;

class UpperTri
{
private:
    int *A;
    int n;

public:
    UpperTri()
    {
        n = 2;
        A = new int[2 * (2 + 1) / 2];
    }
    UpperTri(int n) // Parameterised Constructor
    {
        this->n = n;
        A = new int[n * (n + 1) / 2];
    }
    ~UpperTri() // Destructor
    {
        delete[] A;
    }
    void Set(int i, int j, int x);
    int Get(int i, int j);
    void Display();
    int GetDimension() { return n; }
};
void UpperTri::Set(int i, int j, int x)
{
    if (i <= j)
        A[((i-1)*n- (i-2)*(i - 1)/2)+ (j - i)] = x;
}
int UpperTri::Get(int i, int j)
{
    if (i <= j)
        return A[ ((i-1)*n- (i-2)*(i - 1)/2)+ (j - i)];
    return 0;
}
void UpperTri::Display()
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i <= j)
                cout << A[((i-1)*n- (i-2)*(i - 1)/2)+ (j - i)] << " ";
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
    UpperTri lm(d);
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