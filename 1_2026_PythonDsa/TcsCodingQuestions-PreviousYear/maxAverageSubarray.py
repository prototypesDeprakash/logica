arr=[1,12,-5,-6,50,3]
k = 4

window=0
for i in range(0,k):
    window+=arr[i]
max_val=window/k

for i in range(1,len(arr)-k+1):
    window-=arr[i-1]
    window+=arr[i+k-1]
    max_val=max(max_val,window/k)
print(max_val)