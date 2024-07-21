#include<iostream>
using namespace std;
    
void AllPairShortest(int cost[][4], int n) {
    
    for (int k = 0; k < n; k++) {
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
               
                if (cost[ i ][ k ] != -1 && cost[ k ] [j ] != -1) {
               
                    if (cost[ i ][ j ] == -1 || cost[ i ][ j ] > cost[ i ][ k ] + cost[ k ][ j ] ) {
                        cost[ i ][ j ] = cost[ i ][ k ] + cost[ k ][ j ];
                    }
                }
            }
        }
    }
}

int main() {
    int cost[4][4] = { {0, 3, -1, 7}, {8, 0, 2, -1}, {5, -1, 0, 1}, {2, -1, -1, 0} };
    AllPairShortest(cost, 4);

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cout << cost[i][j] << " ";
        }
        cout << endl;
    }
}
