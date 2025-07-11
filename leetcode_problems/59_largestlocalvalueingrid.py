'''
Largest Local Values in a Matrix
Easy
Topics
Companies
Hint
You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
'''
grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
n=len(grid)
res=[[0 for _ in range(n-2)] for _ in range(n-2)]
for i in range(n-2):
    for j in range(n-2):
        best=grid[i][j]
        for ii in range(i,i+3):
            for jj in range(j,j+3):
                best=max(best,grid[i][j])
        res[i][j]=best
print(res)