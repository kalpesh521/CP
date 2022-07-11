#include <iostream>
using namespace std;

inline int product(int a, int b)
{
    //Do not use inline function with static function
    //static int c = 0; //execute only one time
    //c = c + 2;        //next retained value
    return a * b; //+ c;
}
//Defaualt Arguments
float moneyreceived(int currentmoney, float factor = 1.04)
{
    return currentmoney * factor;
}
//Constant Arguments
int strlen(const char *p)
{
}
int main()
{
    /*cout << "Using Inline  function" << endl;
    int a, b;
    cout << "Enter value of and b" << endl;
    cin >> a >> b;
    cout << "The product is " << product(a, b) << endl;
    cout << "The product is " << product(a, b) << endl;
    cout << "The product is " << product(a, b) << endl;
    cout << "The product is " << product(a, b) << endl;
    cout << "The product is " << product(a, b) << endl;*/

    //default Arguments
    int money = 100000;
    cout << "If you have " << money << " then you will receive " << moneyreceived(money) << " after one year.0" << endl;
    cout << "If VIP  have " << money << " then Vip will receive " << moneyreceived(money, 1.1) << " after one year.0" << endl;

    return 0;
}
