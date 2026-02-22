matrix = [[1,2,3],[4,5,6],[7,8,9]]

row = len(matrix)
col = len(matrix[0])
diagonalSum=0
for i in range(row):
    for j in range(col):
        if(i==j):
            diagonalSum+=matrix[i][j]
        if((i+j==row-1) and (i!=j)):
            diagonalSum+=matrix[i][j]
print(diagonalSum)

#optimalSolution
ds=0
for i in range(len(matrix)):
    ds+=matrix[i][i]
    ds+=matrix[i][(len(matrix))-1-i]    
if(len(matrix)%2==1):
    ds-=matrix[len(matrix)//2][len(matrix)//2]
print(ds)
