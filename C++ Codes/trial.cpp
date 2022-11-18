#include <bits/stdc++.h>
using namespace std;

void printsolution(vector<vector<int>> &board)
{
    for (int i = 0; i < board.size(); i++)
    {
        for (int j = 0; j < board.size(); j++)
        {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;
}

bool issafe(vector<vector<int>> &board, int row, int col)
{
    int i, j;
    for (int i = 0; i < col; i++)
    {
        if (board[row][i])
            return false;
    }
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
    {
        if (board[i][j])
            return false;
    }
    for (int i = row, j = col; i < board.size() && j >= 0; i++, j--)
    {
        if (board[i][j])
            return false;
    }
    return true;
}
bool nqueen(vector<vector<int>> &board, int col)
{
    if (col >= board.size())
        return true;
    for (int i = 0; i < board.size(); i++)
    {
        if (issafe(board, i, col))
        {
            board[i][col] = 1;
            if (nqueen(board, col + 1))
            {
                return true;
            }
            board[i][col] = 0;
        }
    }
    return false;
}

int main(int argc, char const *argv[])

{
    int n;
    cout << "Enter the number of queens: ";
    cin >> n;
    vector<vector<int>> board(n, vector<int>(n, 0));
    if (nqueen(board, 0) == false)
    {
        cout << "Solution does not exist";
    
    }
    else
    {
        cout << "Solution for " << n << " queen is : \n";
        printsolution(board);
    }
    return 0;
}