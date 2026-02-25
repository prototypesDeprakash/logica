matrix = [
    [1,1,0],
    [1,0,1],
    [1,1,1]]



need_Zero_row=set()
need_Zero_col=set()
for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        if(matrix[i][j]==0):
            need_Zero_row.add(i)
            need_Zero_col.add(j)


for i in range(0,len(matrix)):
    for j in range(0,len(matrix[0])):
        #row update
        if(i in need_Zero_row):
            matrix[i][j]=0
        #col update
        if(j in need_Zero_col):
            matrix[i][j]=0
for i in matrix:
    print(i)



'''
#print row 1 
#print(matrix[0])

#print column 1
for i in matrix:
    print(i[1])


r=len(matrix)
c=len(matrix[0])
newmatrix=matrix

print(newmatrix)

rownumbers=[]
columnnumbers=[]

for i in range(r):
    for j in range(c):
        if(matrix[i][j]==0):
            pass
            rownumbers.append[i]
            columnnumbers.append[j]
            #make that whole row 0 (i)
            #make that whole column 0 (j)

  


'''