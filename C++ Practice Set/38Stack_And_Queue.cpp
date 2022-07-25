#include <bits/stdc++.h>
using namespace std;
int main()
{
 // Container Adapter
    stack<int> s;
    s.push(2);
    s.push(3);
    s.push(7);
    s.push(9);
    while (!s.empty())
    {
        cout << s.top() << endl;
        s.pop();
    }

    queue<string> q;
    q.push("abs");
    q.push("rbs");
    q.push("ebs");
    q.push("dbs");
    while (!q.empty())
    {
        cout << q.front() << endl;
        q.pop();
    }

    cout << endl;
    priority_queue<int> pq;                             // max-heap decreasing order
    priority_queue<int, vector<int>, greater<int>> pq2; // min-heap increasing order

    pq.push(5);
    pq.push(19);
    pq.push(8);
    pq.push(15);
    pq2.push(4);
    pq2.push(11);
    pq2.push(18);
    pq2.push(7);

    cout << pq.top() << endl;
    cout << pq2.top() << endl;
    cout << pq.size() << endl;
    cout << pq2.size() << endl;

    cout << endl;
    while (!pq.empty())
    {

        cout << pq.top() << endl;
        pq.pop();
    }
    cout << endl;

    while (!pq2.empty())
    {

        cout << pq2.top() << endl;
        pq2.pop();
    }

    return 0;
}