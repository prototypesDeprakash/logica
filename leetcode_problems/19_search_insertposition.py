'''
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

'''
nums = [3,6,7,8,10]
target = 5
if(target in nums):
    print(nums.index(target))

if(target-1 in nums):
    print(nums.index(target-1)+1)
if(target>max(nums)):
    print(len(nums)+1)
else:
    if(target+1 in nums):
        print(nums.index(target+1))
    
