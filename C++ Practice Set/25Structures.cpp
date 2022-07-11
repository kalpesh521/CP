#include <iostream>
using namespace std;
struct rect{
    int len;
    int bredth;
};
int main(int argc, char const *argv[])
{
    struct rect r;
    r.len=5;
    r.bredth=6;
    cout<<"Area Of rectangle is"<<" " <<r.len*r.bredth<<endl;
    
    return 0;
}
