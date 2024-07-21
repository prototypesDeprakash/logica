'''Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]'''
nums = [2,0,2,1,1,0]
l=0 
r=len(nums)-1
i=0
while i<=r:
    if(nums[i]==0):
        nums[i],nums[l]=nums[l],nums[i]
        l+=1
        
    elif(nums[i]==2):
        nums[i],nums[r]=nums[r],nums[i]
        r-=1
        i-=1
    i+=1
print(nums)
    