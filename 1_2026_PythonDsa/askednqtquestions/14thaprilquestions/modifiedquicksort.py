n=int(input())
arr=list(map(int,input().split()))
pivot=arr[-1]
arr.pop(arr.index(pivot))
print(arr)
smallnumbers=[]
bignumbers=[]
print(pivot)
for i in arr:
    if(i<pivot):
        smallnumbers.append(i)
    else:
        bignumbers.append(i)
res=smallnumbers+[pivot]+bignumbers
print(res.index(pivot))