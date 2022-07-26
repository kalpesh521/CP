#include <bits/stdc++.h>
using namespace std;
struct Array
{
    int A[10];
    int size;
    int length;
};

void Display(struct Array arr)
{
    for (int i = 0; i < arr.length; i++)
    {
        cout << arr.A[i] << endl;
    }
}
void Append(struct Array *arr, int x)
{
    if (arr->length < arr->size)
    {
        arr->A[arr->length++] = x;
    }
}

void insert(struct Array *arr, int index, int x)
{
    for (int i = arr->length; index < i; i--)
    {
        arr->A[i] = arr->A[i - 1];
    }
    arr->A[index] = x;
    arr->length++;
}

int Delete (struct Array *arr, int index)
{
    int x = 0;
    int i;
    if (index >= 0 && arr->length > index)
    {
        x = arr->A[index];
        for (i = index; i < arr->length - 1; i++)
        {
            arr->A[i] = arr->A[i + 1];
        }
        arr->length--;
        return x;
    }
    return 0;
}
 
int main(int argc, char const *argv[])
{

    struct Array arr = {{1, 23, 4, 5, 6, 7}, 10, 6};
    // Append(&arr, 10);
    // insert(&arr, 3, 6);
    Delete(&arr, 0);
    Display(arr);

    return 0;
}