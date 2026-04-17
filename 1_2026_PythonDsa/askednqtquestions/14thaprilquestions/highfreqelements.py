arr=[1,3,2,3,4,1,1,2,2,2]

# freqarr=[0]*(max(arr)+1)
# for i in arr:
#     freqarr[i]+=1

# maxfreq=max(freqarr)
# maxfreq_element=[]
# for  i in range(len(freqarr)):
#     if(freqarr[i]==maxfreq):
#         maxfreq_element.append(i)
# print(min(maxfreq_element))


freq={}

for i in arr:
    freq[i]=freq.get(i,0)+1
maxfre = max(freq.values())
ans=float('inf')
for i in freq:
    if(freq[i]==maxfre):
        ans=min(ans,i)
print(ans)