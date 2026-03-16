arr = [2,2,2,2,5,5,5,8]
k = 3
threshold = 4

t=0
window = 0
for i in range(0,k):
    window+=arr[i]
avg = window/k
if(avg>=threshold):
    t+=1

for i in range(1,len(arr)-k+1):
    window-=arr[i-1]
    window+=arr[i+k-1]
    avg=window/k
    if(avg>=threshold):
        t+=1
print(t)

