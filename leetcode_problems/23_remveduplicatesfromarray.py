'''Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 '''
'''nums = [0,0,1,1,1,2,2,3,3,4]
maxx=len(nums)
nums=set(nums)
minn=len(nums)
nums=list(nums)

tot=maxx-minn
print(tot)
for i in range(0,tot):
    nums.append('_')
print(nums)'''

nums = [0,0,1,1,1,2,2,3,3,4]
l=1

for r in range(1,len(nums)):
    if(nums[r]!=nums[r-1]):
        nums[l]=nums[r]
        l+=1
print(l)
print(nums)
        

        

    
