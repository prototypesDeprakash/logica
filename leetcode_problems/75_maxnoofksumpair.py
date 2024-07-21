'''
Max Number of K-Sum Pairs

You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array 
whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array
Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
'''
nums=[4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4]
k = 2
c=0
nums.sort()

l=0
r=len(nums)-1
while (l<r):
    if(nums[l]+nums[r]==k):
        c+=1
        l+=1
        r-=1
    elif(nums[l]+nums[r]<k):
        l+=1
    else:
        r-=1
print(c)
