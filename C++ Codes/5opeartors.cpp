
#include <iostream>
using namespace std;
int main()
{
    int num1, num2, i, s;

    cout << "Enter value of num1: ";
    cin >> num1;

    cout << "Enter value of num2: ";
    cin >> num2;
    cout << "Enter value of num2: ";
    cin >> i;
    //Arithematic Operator
    cout << "The Sum  is " << num1 + num2 << endl; // newline operator
    cout << "The Sub  is " << num1 - num2 << "\n";
    cout << "The multiplication  is " << num1 * num2 << "\n";
    cout << "The  Division  is " << num1 / num2 << "\n";
    cout << "The Sum  is " << num1 % num2 << endl;//
    cout << "The num1++  is " << num1++ << endl;//25
    cout << "The num1--    is " << num1-- << endl;//26
    cout << "The ++num1   is " << ++num1 << endl;//26
    cout << "The --num1   is " << --num1 << endl;//25
    cout << "The  i   is " << i++ - --i + ++i - --i + ++i << endl; 
                             //3 -  3  + 4 - 3 + 4 =5                    
    return 0;
} 

//Logical operator
