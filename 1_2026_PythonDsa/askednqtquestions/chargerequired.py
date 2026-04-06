n=int(input())
arr=list(map(int,input().split(" ")))
x=0
for i in arr:
    if(i>=n):
        x+=1
print(x)
