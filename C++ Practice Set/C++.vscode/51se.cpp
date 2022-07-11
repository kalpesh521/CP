#include <iostream>
using namespace std;

typedef struct student
{
   int roll_num;
   char name[20];
   float marks;

} stud;

void create(stud s[20], int n);
void display(stud s[20], int n);
void bubble_sort(stud s[20], int n);

int main(int argc, char const *argv[])
{
   stud s[20];
   int ch, n, key, result;
   char x[20];

   do
   {
       cout << "\n 1 ) Create Student database";
       cout << "\n 2 ) Display Student records";
       cout << "\n 3 ) Bubble Sort";
       cout << "\n 8 ) Exit";
       cout << "\n Enter Your Choice";
       cin >> ch;

       switch (ch)
       {
       case 1:
           cout << "\n Enter the Number of Records : = ";
           cin >> n;

           create(s, n);
           break;

       case 2:
           display(s, n);
           break;
       case 3:
           bubble_sort(s, n);
           break;

       case 8:
           return 0;

       default:

           cout << "\n invalid choice !! Please enter your valid choice again ." << endl;
       }

   } while (ch != 8);
}

void create(stud s[20], int n)
{
   int i;
   for (int i = 0; i < n; i++)
   {
       cout << "\n Enter the roll number :=";
       cin >> s[i].roll_num;

       cout << "\n Enter the Name:=";
       cin >> s[i].name;

       cout << "\n Enter the marks:=";
       cin >> s[i].marks;
   }
}

void display(stud s[20], int n)
{

   int i;
   cout << "\n"
        << "\t"
        << "Roll No"
        << "\t"
        << "Name"
        << "\t"
        << "Marks";
   for (i = 0; i < n; i++)
   {
       cout << "\n";
       cout << "\t" << s[i].roll_num << "\t" << s[i].name << "\t" << s[i].marks;
   }
}

void bubble_sort(stud s[20], int n)
{

   int i, j;
   stud temp;
   for (i = 1; i < n; i++)
   {
       for (j = 0; j < n - i; j++)
       {
           if (s[j].roll_num > s[j + 1].roll_num)
           {
               temp = s[j];
               s[j] = s[j + 1];
               s[j + 1] = temp;
           }
       }
   }
}
