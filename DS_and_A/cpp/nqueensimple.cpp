#include <iostream>
using namespace std;
#include <vector>
#include <cmath>
//std::vector<int> is dynamic array
//&board-reference of the board

bool isSafe(const vector<int>& board, int row, int col) {
    for (int i = 0; i < row; i++) {
        if (board[i] == col || abs(board[i] - col) == abs(i - row)) {
            return false;
        }
    }
    return true;
}



bool solveNqueensutil(vector<int> & board, int row, int n){
    if(row==n){
        return true;
    }
    for(int col=0;col<n ;col++){
        if(isSafe(board,row,col)){

            board[row] = col;
            if(solveNqueensutil(board,row+1,n)){
                return true;

            }
            //backtrack
            board[row]=-1;
        }
    }
    return false;
}
void solvenqueens(int n){
    //board(n, -1): This creates a vector named board with n elements, all initialized to -1
    vector<int> board(n,-1);
     if (solveNqueensutil(board, 0, n)) {
        cout << "One solution: ";
        for (int col : board) {
            std::cout << col + 1 << " ";
        }
        std::cout << std::endl;
    } else {
        std::cout << "No solution" << std::endl;
    }


}
int main(){
    solvenqueens(8);
}