#include <bits/stdc++.h>
using namespace std;
struct Array
{
    int A[10];
    int size;
    int length;
};

void Append(struct Array *arr,int x)
{
    if (arr->length < arr->size)
    {
        arr->A[arr->length++] = x;
    }
}
void Display(struct Array arr)
{
    for (int i = 0; i < arr.length; i++)
    {
        cout << arr.A[i] << endl;
    }
}
int main(int argc, char const *argv[])
{

    struct Array arr = {{1, 23, 4, 5, 6, 7}, 10, 6};
    Append(&arr, 10);
        Display(arr);

    return 0;
}