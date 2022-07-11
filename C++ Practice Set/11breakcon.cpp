
#include <iostream>
using namespace std;
int main()
{

    for (int i = 0; i <= 100; i++)
    {
        cout << i << endl;
        if (i % 2 == 0)
        {
            cout << "Even Number" << " ";
            cout << i << endl;

            continue;
        }
    }

    return 0;
}
