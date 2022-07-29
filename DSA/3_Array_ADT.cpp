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
        cout << arr.A[i] << " ";
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

int Get(struct Array arr, int index)
{
    if (index >= 0 && index < arr.length)
    {
        return arr.A[index];
    }
    return -1;
}

void Set(struct Array *arr, int index, int x)
{
    if (index >= 0 && index < arr->length)
    {
        arr->A[index] = x;
    }
}

int Max(struct Array arr)
{
    int max = arr.A[0];
    int i;
    for (i = 1; i < arr.length; i++)
    {
        if (arr.A[i] > max)
        {
            max = arr.A[i];
        }
    }
    return max;
}
int Min(struct Array arr)
{
    int min = arr.A[0];
    int i;
    for (i = 1; i < arr.length; i++)
    {
        if (arr.A[i] < min)
        {
            min = arr.A[i];
        }
    }
    return min;
}

int Sum(struct Array arr)
{
    int s = 0;
    int i;
    for (i = 0; i < arr.length; i++)
    {
        s += arr.A[i];
    }
    return s;
}

float Avg(struct Array arr)
{
    return (float)Sum(arr) / arr.length;
}

// Reverse
// Method 1

void Reverse(struct Array *arr)
{
    int *B;
    int i, j;
    B = new int[arr->length];
    // B=(int *)malloc(arr->length*sizeof(int));
    for (i = arr->length - 1, j = 0; i >= 0; i--, j++)
    {
        B[j] = arr->A[i];
    }
    for (int i = 0; i < arr->length; i++)
    {
        arr->A[i] = B[i];
    }
}

// Method 2

void Reverse2(struct Array *arr)
{
    int i, j;
    for (i = 0, j = arr->length - 1; i < j; i++, j--)
    {
        swap(arr->A[i], arr->A[j]);
    }
}

void InsertEle(struct Array *arr, int x)
{
    int i = arr->length - 1;

    if (arr->length == arr->size)
    {
        return;
    }
    if (i >= 0 && arr->A[i] > x)
    {
        arr->A[i + 1] = arr->A[i];
        i--;
    }
    arr->A[i + 1] = x;
    arr->length++;
}
int isSorted(struct Array arr)
{
    int i;
    for (i = 0; i < arr.length - 1; i++)
    {
        if (arr.A[i] > arr.A[i + 1])
            return 0;
    }
    return 1;
}

void Rearange(struct Array *arr)
{
    int i = 0;
    int j = arr->length - 1;
    while (i < j)
    {
        while (arr->A[i] < 0)
            i++;
        while (arr->A[i] >= 0)
            j--;

        if (i < j)
        {
            swap(&arr->A[i], &arr->A[j]);
        }
    }
}
int main(int argc, char const *argv[])
{

    //  struct Array arr = {{1, 23, 4, 5, 6, 7}, 10, 6};
    struct Array arr = {{1, -2, 4, -5, 6, -9}, 10, 6}; // Sorted Array
    // Append(&arr, 10);
    // insert(&arr, 3, 6);
    // Delete(&arr, 0);
    // cout << LinearSearch(&arr, 7) << endl;
    // cout << BinarySearch(arr, 5) << endl;
    // cout << RecBinSearch(arr.A, 0, arr.length, 4) << endl;
    // cout << "Display  Array" << endl;
    // cout<<Get(arr, 4)<<endl;
    // Set(&arr, 4, 25);
    // cout << Max(arr) << endl;
    // cout << Min(arr) << endl;
    // cout << Sum(arr) << endl;
    // cout << Avg(arr) << endl;
    // Reverse2(&arr);
    // InsertEle(&arr, 8);
    //cout << isSorted(arr) << endl;
    Rearange(&arr);
    Display(arr);

    return 0;
}