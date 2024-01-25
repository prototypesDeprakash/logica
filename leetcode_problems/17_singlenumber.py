'''
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 
 '''
nums = [2,2,1,1,4]
nums.sort()
for i in range(0,len(nums)):
    if(nums.count(nums[i])==1):
        print(nums[i])
        exit