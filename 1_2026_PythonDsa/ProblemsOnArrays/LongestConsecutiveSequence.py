nums=[1,0,1,2]
nums.sort()
seq=1
maxseq=1
for i in range(0,len(nums)-1):
    if nums[i] == nums[i+1]:
        continue
    if(nums[i]==nums[i+1]-1):
           
            seq+=1
    else:
        seq=1
    maxseq=max(seq,maxseq)
            
print(maxseq)
