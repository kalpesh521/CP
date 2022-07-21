#include <bits/stdc++.h>
using namespace std;
int main(){

    stack<int> s;
    s.push(2);
    s.push(3);
    s.push(7);
    s.push(9);
    while(!s.empty()){
        cout<<s.top()<<endl;
        s.pop();
    }

queue<string> q;
q.push("abs");
q.push("rbs");
q.push("ebs");
q.push("dbs");
while(!q.empty()){
    cout<<q.front()<<endl;
    q.pop();
}
    return 0;
}