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

int Delete(struct Array *arr, int index)
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

void swap(int *x, int *y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}
int LinearSearch(struct Array *arr, int key)
{
    int i;
    for (i = 0; i < arr->length; i++)
    {

        if (key == arr->A[i])
        {
            // swap(&arr->A[i], &arr->A[i - 1]); //Transposition
            swap(&arr->A[i], &arr->A[0]); // Move to Front
            return i;
        }
    }
    return -1;
}

int BinarySearch(struct Array arr, int key)
{
    int l, h, mid;
    l = 0;
    h = arr.length - 1;
    while (l <= h)
    {
        mid = (l + h) / 2;
        if (key == arr.A[mid])
        {
            return mid;
        }
        else if (key <= arr.A[mid])
        {
            return h = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return -1;
}

int RecBinSearch(int a[], int l, int h, int key)
{
    int mid = 0;
    while (l <= h)
    {
        mid = (l + h) / 2;
        if (key == a[mid])
        {
            return mid;
        }
        else if (key < a[mid])
        {
            return RecBinSearch(a, l, mid - 1, key);
        }
        else
        {
            RecBinSearch(a, mid + 1, h, key);
        }
    }
    return -1;
}
int main(int argc, char const *argv[])
{

    struct Array arr = {{1, 23, 4, 5, 6, 7}, 10, 6};
    // Append(&arr, 10);
    // insert(&arr, 3, 6);
    // Delete(&arr, 0);
    // cout << LinearSearch(&arr, 7) << endl;
    // cout << BinarySearch(arr, 5) << endl;
    cout << RecBinSearch(arr.A, 0, arr.length, 4) << endl;
    cout << "Display  Array" << endl;
    Display(arr);

    return 0;
}