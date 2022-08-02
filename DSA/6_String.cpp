#include <bits/stdc++.h>
using namespace std;

int valid(char *name)
{
    int i;
    for (int i = 0; name[i] != '\0'; i++)
    {
        if ((name[i] >= 65 && name[i] <= 90) && (name[i] >= 90 && name[i] <= 122) && (name[i] >= 48 && name[i] <= 58))
            return 0;
    }
    return 1;
}
int main(int argc, char const *argv[])
{
    /*
     char A[] ="kalpesh";
     //char B[] ="WELCOME";
     char B[] ="welcome";
     int i=0;
     for ( int i = 0; B[i] !='\0'; i++)
     {
        //B[i]=B[i]+32;// 'A'=65 'a'=97  Uppercase to lowercase
        B[i]=B[i]-32;   // Lowercase to uppercase
     }
     cout<<i<<endl;
     cout<<B<<endl;



   char A[]="KALPESHpawar";
   int i=0;
   for ( int i = 0; A[i]!='\0'; i++)
   {
        if(A[i]>=65 && A[i]<=90){
           A[i]+=32;
        }else if(A[i]>=90 && A[i]<=122){
           A[i]-=32;
        }
   }
   cout<<A<<" ";
   */

    char A[] = "How are you";
    int i, vcount = 0, ccount = 0;

    for (int i = 0; A[i] != '\0'; i++)
    {
        if (A[i] == 'a' || A[i] == 'e' || A[i] == 'E' || A[i] == 'A' || A[i] == 'O' || A[i] == 'o')
        {
            vcount++;
        }
        else if ((A[i] >= 65 && A[i] <= 90) || (A[i] >= 90 && A[i] <= 122))
        {
            ccount++;
        }
    }
    cout << "Vowel Count in String " << endl;
    cout << vcount << endl;
    cout << "Consonant count in string " << endl;
    cout << ccount << endl;

    int word = 1;
    for (int i = 0; A[i] != '\0'; i++)
    {
        if (A[i] == ' ' && A[i - 1] != ' ')
        {
            word++;
        }
    }
    cout << "Total Word in sentence are " << endl;
    cout << word;

    char *name = "kp@!125";
    if (valid(name))
    {
        cout << "Valid String" << endl;
        ;
    }
    else
    {
        cout << "Invalid string" << endl;
    }
    return 0;
}