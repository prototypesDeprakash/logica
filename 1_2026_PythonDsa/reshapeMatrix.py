mat = [[1,2],[3,4]]
r = 2
c = 4

row=len(mat)
col=len(mat[0])
reshaped=[[0]*c for i in range(r)]


rownum=0
colnum=0
if(row*col!=c*r):
    #wecannot reshape ,return mat
    print("error")
for i in range(row):
    for j in range(col):
        reshaped[rownum][colnum]=mat[i][j]
        colnum+=1
        if(colnum==c):
            colnum=0
            rownum+=1

print(reshaped)