#include <iostream>
#include <vector>

using namespace std;
void printfunction(vector<vector<int>> &board)
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

bool isSafe(vector<vector<int>> &board, int row, int col)
{
    int i, j;
    for (i = 0; i < col; i++)
    {
        if (board[row][i])
        {
            return false;
        }
    }
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
    {
        if (board[i][j])
            return false;
    }
    for (i = row, j = col; i < board.size() && j >= 0; i++, j--)
    {
        if (board[i][j])
            return false;
    }
    return true;
}

bool solvequeen(vector<vector<int>> &board, int col)
{

    if (col >= board.size())
    {
        return true;
    }

    for (int i = 0; i < board.size(); i++)
    {
        if (isSafe(board, i, col))
        {
            board[i][col] = 1;

            if (solvequeen(board, col + 1))
            {
                return true;
            }
            board[i][col] = 0;
        }
    }
    return false;
}

int main()
{
    // cout << "enter number of queen" << endl;
    // int n;
    // cin >> n;
    // vector<vector<int>> board(n, vector<int>(n, 0));
    // if (solvequeen(board, 0) == false)
    // {
    //     cout << "Solution not exist";
    //     return 0;
    // }
    // else
    // {
    //     cout << "The soution of " << n << "queen";
    //     printfunction(board);
    // }
    // return 0;
    int n;
    cout << "Enter the number of queens: ";
    cin >> n;
    vector<vector<int>> board(n, vector<int>(n, 0));
    if (solvequeen(board, 0) == false)
    {
        cout << "Solution does not exist";
        return 0;
    }
    else
    {
        cout << "Solution for " << n << " queen is : \n";
        printfunction(board);
    }

    return 0;
}