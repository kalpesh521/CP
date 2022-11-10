#include <bits/stdc++.h>
using namespace std;

typedef struct
{
    int v;
    int w;
    float d;
} Item;
void input(Item items[], int sizeOfItems)
{
    cout << "Enter total " << sizeOfItems << " items value and weight\n"
         << endl;
    for (int i = 0; i < sizeOfItems; i++)
    {
        cout << "\nEnter: " << i + 1 << "v\t";
        cin >> items[i].v;
        cout << "Enter: " << i + 1 << "w\t";
        cin >> items[i].w;
    }
}
void display(Item items[], int sizeOfItems)
{
    int i;
    cout << endl
         << "Values: ";
    for (i = 0; i < sizeOfItems; i++)
    {
        cout << items[i].v << "\t";
    }
    cout << endl
         << "weight: ";
    for (i = 0; i < sizeOfItems; i++)
    {
        cout << items[i].w << "\t";
    }
    cout << endl;
}
bool compare(Item i1, Item i2)
{
    return (i1.d > i2.d);
}
float knapsack(Item items[], int sizeOfItems, int w)
{
    int i, j;
    float totvalue = 0, totweight = 0;
    for (i = 0; i < sizeOfItems; i++)
    {
        items[i].d = (float)items[i].v / items[i].w;
    }
    sort(items, items + sizeOfItems, compare);
    for (i = 0; i < sizeOfItems; i++)
    {
        if (totweight + items[i].w <= w)
        {
            totvalue += items[i].v;
            totweight += items[i].w;
        }
        else
        {
            int wt = w - totweight;
            totvalue += (wt * items[i].d);
            totweight += wt;
            break;
        }
    }
    cout << "Total weight in bag: " << totweight << endl;
    return totvalue;
}
int main()
{
    int w;
    Item items[4];
    input(items, 4);
    cout << "\n Display data: ";
    display(items, 4);
    cout << "\nEnter knapsack weight: ";
    cin >> w;
    float mxval = knapsack(items, 4, w);
    cout << "\nMax value for " << w << " weight is " << mxval;
}
