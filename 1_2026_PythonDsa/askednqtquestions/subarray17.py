n=int(input())
arr=list(map(int,input().split(" ")))
k=int(input())
c=0
for i  in range(n):
    for j in range(i,n):
        s=sum(arr[i:j+1])
        if(s==k):
            c+=1
print(c)