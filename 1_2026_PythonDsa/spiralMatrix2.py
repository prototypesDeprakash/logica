n=3
# create matrix

matrix = [[0]*n for i in range(n)]


left =0
right = n-1
top=0
bottom = n-1

x=0

while(left<=right and top<=bottom):
    for i in range(left,right+1):
        x=x+1
        matrix[top][i]=x

    top+=1
    
    for i in range(top, bottom+1):
        x=x+1
        matrix[i][right]=x
    right-=1

    if(top<=bottom):
        for i in range(right,left-1,-1):
            x=x+1
            matrix[bottom][i]=x
        bottom-=1
    if(left<=right):
        for i in range(bottom,top-1,-1):
            x=x+1
            matrix[i][left]=x
        left+=1
print(matrix)
