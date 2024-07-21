#include <iostream>
using namespace std;
#include <vector>
#include <cmath>

bool isSafe(const vector<int> &board , int row , int col){
    for(int i=0;i<row;i++){
        if(board[i]==col || abs(board[i]-col) ==abs(i-row) ){
            return false;
        }
    }
    return true;
}

bool nqueensutil(vector<int> &board , int row , int n){
    if(row==n){
        return true ;
    }
    for(int col =0;col <n;col++){
        if(isSafe(board,row,col)){
            board[row]=col;

            if(nqueensutil(board,row+1,n)){
                return true;
            }
            //backtrack
            board[row]=-1;
        }
    }

    return false;
}
void nqueens(int n ){
    vector<int> board (n,-1);
  
    if(nqueensutil(board,0,n)){
        cout<< "One solution";
        for (int c:board){
            cout<<c+1<<"";
        }
        cout<<endl;

    }
    else{
        cout<<"no solution";
    }
}
int main(){
    nqueens(8);
}