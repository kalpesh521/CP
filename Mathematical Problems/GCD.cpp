#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n1, n2, i, temp,hcf;
    cout << "Enter n1" << endl;
    cin >> n1;
    cout << "Enter n2" << endl;
    cin >> n2;
    if (n1 > n2)
    {
        temp = n1;
        n1 = n2;
        n2 = temp;
    }

    for (int i = 1; i <= n2; i++)
    {

        if ((n1 % i == 0) &&
            (n2 % i == 0))
        {
        hcf = i;
        }
         
    }cout <<"HCF is "<< hcf;
   
    return 0;
}
