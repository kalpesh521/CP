#include <iostream>
using namespace std;
typedef struct employee
{
    /* data */
    int eid;
    char post;
    float salary;

} ep;

//Union
union money 
{
    /* data */
    int rice;
    char name;
    float price;
};

int main()
{

    /*//struct employee kp;
    ep kp; // By using typedef struct employee-->ep
    kp.eid = 5;
    kp.post = 'c';
    kp.salary = 1200000;
    cout << kp.eid << endl;
    cout << kp.post << endl;
    cout << kp.salary << endl;

    union money m1;
    m1.rice = 56;
   // m1.name = 'k';
    //m1.price = 5000;
    cout<<m1.rice<<endl;
    //cout<<m1.name<<endl;
   //cout<<m1.price<<endl;*/

   //enum
    enum meal{Breakfast ,lunch,dinner};
    //meal m1=Breakfast;
    meal m1=lunch;
   // meal m1=dinner;
    cout<<m1;
    
    /*cout<<Breakfast<<endl;
    cout<<lunch<<endl;
    cout<<dinner<<endl;*/
    return 0;
}
