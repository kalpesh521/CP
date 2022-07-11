#include <iostream>
using namespace std;

typedef struct student
{
    int roll_num;
    char name[20];
    float marks;

} stud;

void create(stud s[20],int n);
void display(stud s[20],int n);
void bubble_sort(stud s[20],int n);

int main(int argc, char const *argv[])
{

    return 0;
}
