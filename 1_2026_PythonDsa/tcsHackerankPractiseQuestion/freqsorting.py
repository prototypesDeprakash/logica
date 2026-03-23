arr=[2,0,2,1,1,0]
freq=[0]*3

for i  in arr:
    freq[i]+=1
arr.clear()
for i in range(0,len(freq)):
    arr+=([i]*freq[i])
    
print(arr)