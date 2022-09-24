#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{

    //============= Rectangular Pattern=============
    /*int row, col;
    cin >> row >> col;
    for (int i = 1; i <= row; i++)
    {
        for (int j = 1; j <= col; j++)
        {
            cout << " * ";
        }
        cout << endl;*/
    //}
    //============= Hollow Pattern=============
    /* int row, col;
      cin >> row >> col;
       for (int i = 1; i <= row; i++)
      {
          for (int j = 1; j <= col; j++)
          {
              if (i == 1 || i == row || j == 1 || j == col)
              {

                  cout << "*";
              }
              else
              {
                  cout << "";
              }
          }
                      cout << endl;

      }
      * * * *
      *     *
      *     *
      * * * *
 */
    //========================================================================================

    // Inverted Pyramid
    /*  int n;
      cin >> n;
      for (int i = n; i >= 1; i--)
      {
          for (int j = 1; j<=i; j++)
          {
              cout << " * ";
          }
          cout << endl;
      }
   return 0;*/
    /*
     ****
     ***
     **
     * */
    //========================================================================================
    /*
        int n;
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (j <= n - i) // n =total row   i= row number
                {
                    cout << " ";
                }
                else
                {
                    cout << "*";
                }
            }
            cout << endl;
        }
    */
    /*

       *
      **
     ***
    *****/
    //========================================================================================
    /*
            int n;
            cin >> n;
            for (int i = 1; i <= n; i++) // row
            {
                for (int j = 1; j <= n; j++) // column iterations
                {
                    if (j <= i)// n =total row   i= row number
                    {
                        cout << "*";
                    }
                    else
                    {
                        cout << "";
                    }
                }
                cout << endl;
            }
    */
    /*
     *
     **
     ***
     ****
     *****
     */

    //=====================half Pyramids of numbers=========
    /*int n;
    cin>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        cout<<i<<" ";
        }
        cout<<endl;
    }
    return 0;*/
    /*
    1
    22
    333
    4444
    55555
    */
    // ==================Floyds Rule=================
    /*int n;
    cin>>n;
    int count=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        cout<<count<<" ";
        count++;
        }
        cout<<endl;
    }*/
    /*
    /*
    1
    2 3
    4 5 6
    7 8 9 10
    */
    //========================================================================================
    /*
            int n;
            cin>>n;
             for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                cout<<"*";
                }
               int  space = 2*n-2*i;
                for(int j=1;j<=space;j++){
                cout<<" ";
                }
                for(int j=1;j<=i;j++){
                cout<<"*";
                }
                cout<<endl;
            }
            // For Mirror Image
             for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                cout<<"*";
                }
               int  space = 2*n-2*i;
                for(int j=1;j<=space;j++){
                cout<<" ";
                }
                for(int j=1;j<=i;j++){
                cout<<"*";
                }
                cout<<endl;
            }*/
    /*
     *      *
     **    **
     ***  ***
     ********
     ********
     ***  ***
     **    **
     *      *
     */
    //========================================================================================

    /*int n;
     cin>>n;
     for ( int i = 1; i <= n; i++)
     {
         for ( int j = 1; j <= n+1-i; j++)
         {
            cout<<j<<" ";
         }
         cout<<endl;
     }
     */
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    //========================================================================================

    /* int n;
     cin >> n;
     for (int i = 1; i <= n; i++)
     {
         for (int j = 1; j <= i; j++)
         {
             if ((i + j) % 2 == 0)
             {
                 cout << "1 ";
             }
             else
             {
                 cout << "0 ";
             }
         }
         cout << endl;
     }*/

    //******************** Rhombus *************************
    /* int n;
     cin >> n;
     for (int i = 1; i <= n; i++)
     {
         for (int j = 1; j <= n - i; j++)
         {
             cout << " ";
         }
         for (int j = 1; j <= n; j++)
         {
             cout << "*";
         }
         cout << endl;
     }

     return 0;
 }*/
    //========================================================================================

    /*int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            cout << j<<" ";
        }
        cout << endl;
    }*/

    //========================================================================================

    /*
        int n;
        cin >> n;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                cout << " ";
            }
            for (int j = 1; j <= i; j++)
            {
                cout << j<<" ";
            }
            for (int j = 1; j <= i; j++)
            {
                cout << j<<" ";
            }
            cout << endl;
        }*/

    //========================================================================================

     int n;
      cin >> n;
      for (int i = 1; i <= n; i++)
      {        int j;

          for ( j = 1; j <= n - i; j++)
          {
              cout << " ";
          }
          int k = i;
          for (; j <= n; j++)
          {
              cout << k--  ;
          }
          k = 2;
          for (; j <= n + i - 1; j++)
          {
              cout << k++  ;
          }
          cout << endl;
      }
  
    //========================================================================================

    
        // int n;
        // cin >> n;
        // for (int i = 1; i <= n; i++)
        // {
        //     for (int j = 1; j <= n - i; j++)
        //     {
        //         cout << " ";
        //     }
        //     for (int j = 1; j <= 2*i - 1; j++)
        //     {
        //         cout << "*";
        //     }
        //     cout<<endl;
        // }
        // for (int i = n; i>=1; i--)
        // {
        //     for (int j = 1; j <= n - i; j++)
        //     {
        //         cout << " ";
        //     }
        //     for (int j = 1; j <= 2*i - 1; j++)
        //     {
        //         cout << "*";
        //     }
        //     cout<<endl;
        // }
    
    //========================================================================================
    /*
        int n;
        cin >> n;
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (((i == 2) && ((j) % 4 == 0)) || ((i + j) % 4 == 0))
                {
                    cout << "*";
                }else
                {
                     cout<<" ";
                }

            }
            cout << endl;
        }
    */
    /* int n;
     cin >> n;
     int count = n;
     int temp = n;
     while (n > 0)
     {

         count = temp;
         while (count > 0)
         {
             for (int i = 1; i < n; i++)
             {
                 cout << count << " ";
             }
             count--;
         }
     }
     cout << " " << endl;
     n--;
 */
    // int n;
    // cin >> n;
    // int count, k;
    // count=n;
    // int temp=n;
    
    // for (int i = n; i >= 1; i--)
    // {
    //     //k = 3 * i;
    //     count=temp;
    //     for (int j = 1; j <= count; count--)
    //     {
    //         cout << count << " ";
    //         count--;
    //     }
    //     cout << endl;
    //     n--;
    // }

    return 0;
}
