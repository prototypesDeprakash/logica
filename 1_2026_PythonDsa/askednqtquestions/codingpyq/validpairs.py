#valid pairs

arr=list(map(int,input().split()))
k=int(input())
c=0
for i in range(0,len(arr)):
  for j in range(0,len(arr)):
    if(i<j and arr[i]-arr[j] ==k):
      c+=1
print(c)
      	