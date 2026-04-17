n=int(input())

costarr=list(map(int,input().split()))

matrix=[]
for i in range(n):
    matrix.append(list(map(int,input().split())))

ans=float('inf')
for i in range(n):
    rowsum=[]
    for j in range(n):
        rowsum.append(matrix[i][j])
    ans=min(ans,(sum(rowsum) +costarr[i] ) )
print(ans)
    
