#include <iostream> 
using namespace std;

class car{
    public:
  string name;
  string type;
  int wheels;

  void carname(){

      cout<<"The name of car is "<<name<<endl;

  }

  void carwheels(){
      cout<<"this car has "<<wheels<<" wheels"<<endl;



  }
  void cartype();

   








}
;
 void car::cartype(){
     cout<<"The type of car is "<<type<<endl;
     
 }

int main(int argc, char const *argv[])
{
   car obj;
   obj.name = "Creta";
   obj.type = "four wheeler ";
   obj.wheels =  4;


   obj.carname();
   obj.cartype();
   obj.carwheels();
    return 0;
}
