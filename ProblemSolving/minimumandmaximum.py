'''find the minimum and maximum sim from an array'''
arr = list(map(int, input().rstrip().split()))
sums=[]
for i in range(0,len(arr)):
    sums.append(0)
    for j in range(0,len(arr)):
        sums[i]+=arr[j]
    sums[i]-=arr[i]
print(min(sums))
print(max(sums))