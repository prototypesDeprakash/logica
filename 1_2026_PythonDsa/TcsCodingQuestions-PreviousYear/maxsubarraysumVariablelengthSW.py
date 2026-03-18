nums = [-2,1,-3,4,-1,2,1,-5,4]

currentsum=0
maxsum=0
for i in range(0,len(nums)):
    currentsum=max(nums[i],currentsum+nums[i])
    maxsum=max(maxsum,currentsum)
print(maxsum)
