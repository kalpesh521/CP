#include <bits/stdc++.h>
#include <list>
using namespace std;

showlist(list<int> ls)
{
    for (auto val : ls)
    {
        cout << val << " ";
    }
}
int main(int argc, char const *argv[])
{
    list<int> ls1, ls2;
    for (int i = 0; i < 10; ++i)
    {
        ls1.push_back(i * 2);
        ls2.push_front(i * 3);
    }
    showlist(ls1);
    cout << endl;
    ls2.pop_front();
    showlist(ls2);
    cout<<endl;
cout<<ls2.front()<<endl;
cout<<ls2.back()<<endl;
ls2.reverse();
showlist(ls2);
ls2.sort();
showlist(ls1);
    return 0;
}
