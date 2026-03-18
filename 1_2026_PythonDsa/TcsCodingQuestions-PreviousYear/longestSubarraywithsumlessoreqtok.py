arr = [4,2,1,7,8,1,2,8]
k = 8
window=0
left=0
maxlen=0
for right in range(0,len(arr)):
    window+=arr[right]
    while(window>=k):
        window-=arr[left]
        left+=1
    maxlen=max(maxlen,right-left+1)
print(maxlen)
    


