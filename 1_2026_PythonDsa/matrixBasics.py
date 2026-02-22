matrix = [[1,2,3],
          [4,5,6],
          [7,8,9]]


transpose=[[0]*len(matrix) for i in range (len(matrix[0]))]
print(transpose)
for i in range(0,len(matrix)):
    for j in range(0,len(matrix[0])):
        print(matrix[j][i],end=" ")
    print()

#row sum
print("=======Row Sum===========")
row = len(matrix)
col = len(matrix[0])
rowsum=0
for i in range(row):
    for j in range(col):
        rowsum+=matrix[i][j]
    print(rowsum)
    rowsum=0
