
/*
===========================================================
Prime Number check
fibonnacci Series
factorial Number
NcR
Pascal traiangle
===========================================================
*/
#include <iostream>
#include <math.h>
using namespace std;

/*int sum(int a, int b)
{
    int c = a + b;
    return c;
}*/
// Passes sum -->user inputs -->goto function-->return c = sum(num1, num2)

// Function prototype

// Syntax --> data type function_name(arguments);

// int sum(int a, int b); --> acceptable
// int sum(int a,  b); --> not acceptable
//========================================================================================
int sum(int, int);
float cube(float k);   //--> acceptable
float square(float s); //--> acceptable
//========================================================================================


bool isprime(int num)
{

    for (int i = 2; i <= sqrt(num); i++)
    {

        if ((num % i) == 0)
        {
            return false;
        }
        return true;
    }
}
//========================================================================================

// Fabinnocci Series
void fib(int num){
    int t1=0;
    int t2 =1;
    int nextterm ;

    for ( int  i = 1; i <= num; i++)

    {
          cout<<t1<<endl;
          nextterm =t1+t2;
          t1=t2;
          t2=nextterm;
              /* code */
    }
    return;
    
}
//========================================================================================

int fact(int n){
    int factorial =1;
    for ( int i = 1; i <= n; i++)
    {
         
        factorial*=i;

    }
    return factorial;
}
//========================================================================================

void g(void);
int main()
{ 
    
//========================================================================================
// num1 and num2 are actual parameters
    /*int num1, num2;
    float k;
    float s;
    cout << "Enter first number " << endl;
    cin >> num1;
    cout << "Enter second number "  << endl;
    cin >> num2;
    cout << "the sum is  " << sum(num1, num2) << endl;


    cout << "Enter number for finding cube "  << endl;
    cin >> k;
    cout << "the cube of " << k << " is  " << cube(k) << endl;


    cout << "Enter number for finding square "  << endl;
    cin >> s;
    cout << "the square of " << s<< " is  " << square(s) << endl;
*/

//========================================================================================

// Find number of prime number between two number
   /* int a, b;
    cin >> a >> b;
    for (int i = a; i <= b; i++)
    {
        if (isprime(i))
        {
            cout << i << endl;
        }
    }*/
/*

//========================================================================================

int n;
cin>>n;
fib(n);
*/

//========================================================================================

// NcR form Binomial
/*int n,r;
cin>>n>>r;
int ans =fact(n)/(fact(r)*fact(n-r));
cout<<ans<<endl;
*/

//========================================================================================

// PASCAL TRIANGLE 
// 1
// 1 1
// 1 2 1
// 1 3 3 1
//1 4 6 4 1
int n;
cin>>n;
for ( int  i = 0; i <=n; i++)
{
 for ( int  j = 0; j <= i; j++)
 {
     cout<<fact(i)/(fact(j)*fact(i-j))<<" ";

 }
 cout<<endl;
 
}
//========================================================================================

    return 0;
}










//========================================================================================


int sum(int a, int b)
{
    // a and b are formal parameters
    int c = a + b;
    return c;
}
//========================================================================================

void g()
{
    cout << "\nhello kalpesh";
}
//========================================================================================

float cube(float k)
{
    float c;
    c = k * k * k;
    return c;
}
//========================================================================================

float square(float s)
{

    float p;
    p = s * s;
    return p;
}
//========================================================================================
