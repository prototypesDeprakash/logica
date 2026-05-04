arr=list(map(int,input().split()))
k= int(input())
res=[]
n=len(arr)
for i in range(0,n-k+1):
    res.append(max(arr[i:i+k]))
print(res)
          
