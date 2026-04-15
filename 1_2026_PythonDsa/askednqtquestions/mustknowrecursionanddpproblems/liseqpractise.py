arr=[1,2,3,4,5,6,7]

n=len(arr)
dp=[1]*n

for i in range(0,n):
    for j in range(0,i):
        if(arr[i]>arr[j]):
            dp[i]=max(dp[i],dp[j]+1)
print(max(dp))