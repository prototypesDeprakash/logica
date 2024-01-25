nums=[1,1]
ans=[0,0]
counts=[]
for i in range(0,len(nums)):
    counts.append(nums.count(i))



for i in range(1,len(nums)+1):
    if(counts[i]==0):
        ans[0]=i
    if(counts[i]==2):
        ans[1]=i
        
        

print(ans)