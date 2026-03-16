arr=[2, 1, 5, 1, 3, 2]
k = 3

#fixed length sliding window

#calculate initial windoe lenght
#when moviing add new and remove old

#initial length
window=0
for i in range(0,k):
    window+=arr[i]
print(window)

for i in range(1,len(arr)-k+1):
    window-=arr[i-1]
    window+=arr[i+k-1]
    print(window)
    
