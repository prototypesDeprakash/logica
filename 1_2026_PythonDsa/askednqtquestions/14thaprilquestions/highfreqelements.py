arr=[1,1,2,2,3,3,4,4,2]

freqarr=[0]*(max(arr)+1)
for i in arr:
    freqarr[i]+=1

maxfreq=max(freqarr)
maxfreq_element=[]
for  i in range(len(freqarr)):
    if(freqarr[i]==maxfreq):
        maxfreq_element.append(i)
print(min(maxfreq_element))