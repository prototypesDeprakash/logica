arr=[1,1,1,1,2,2,3,3,3,4,4,4,4,4]
freqarr=[0]*max(arr)


for i in arr:
    freqarr[i-1]+=1

print(freqarr)

print(freqarr.index(max(freqarr))+1)
print(freqarr.index(min(freqarr))+1)

