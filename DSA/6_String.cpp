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
void swap(char *x, char *y)
{
    char temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
void perm(char s[], int l, int h)
{
    int i;

    if (l == h)
    {
        cout << s << endl;
    }
    else
    {
        for (int i = l; l <= h; i++)
        {
            swap(&s[l], &s[i]);
            perm(s, l + 1, h);
            swap(&s[l], &s[i]);
        }
    }
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
    /*
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

        // Validate a String
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

    // Reversing a String

    char A[] = "Table";
    char B[7]; //
    int i, j;
    for (i = 0; A[i] != '\0'; i++)
    {
    }
    i--;
    for (j = 0; i >= 0; i--, j++)
    {
        B[j] = A[i];
    }
    B[j] = '\0';
    cout << B << " ";

    // Compairaing String
    char A[] = "painter";
    char B[] = "painting";

    int i, j;
    for (i = 0, j = 0; A[i] != '\0' && B[j] != '\0'; i++, j++)
    {
        A[i] != B[j];
        break;
    }
    if (A[i] == B[j])
    {
        cout << "Equal" << endl;
    }
    else if (A[i] < B[j])
    {
        cout << "Small" << endl;
    }
    else
    {
        cout << "Greater" << endl;
    }

    // Check Pallindrome or not

    char A[] = "madam";
    char B[5];
    int i, j;
    for ( i = 0; A[i] != '\0'; i++)
    {
    }
    i--;
    for (j = 0; i >= 0;  i--,j++)
    {
        B[j] = A[i];
    }
    B[j] ='\0';
    cout<<B<<endl;
    if (A[i] == B[j])
    {
        cout << "String id pallindrome" << endl;
    }
    else
    {
        cout << "String is not pallindrome" << endl;
    }

    char A[] = "medical";
    char B[] = "dmmimal";
    int H[26]={0};
    int i;
    for (i = 0; A[i] != '\0'; i++)
    {
        H[A[i] - 97] += 1;
    }
    for (i = 0; B[i] != '\0'; i++)
    {
        H[A[i] - 97] -= 1;

        if (H[A[i] - 97] < 0) //-1 ->not angram
        {
            cout << "String is not anagram" << endl;
            break;
        }
    }
    if (B[i] == '\0')
    {
        cout << "String is anagram" << endl;
    }
*/

    char s[] = "abc";
    perm(s, 0, 2);
    return 0;
}