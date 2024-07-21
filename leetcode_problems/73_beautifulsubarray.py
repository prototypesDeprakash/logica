'''You are given an array nums of positive integers and a positive integer k.

A subset of nums is beautiful if it does not contain two integers with an absolute 
difference equal to k.

Return the number of non-empty beautiful subsets of the array nums.

A subset of nums is an array that can be obtained by deleting some (possibly none)
 elements from nums. Two subsets are different if and only if the chosen indices to delete 
 are different.

 

Example 1:

Input: nums = [2,4,6], k = 2
Output: 4
Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
It can be proved that there are only 4 beautiful subsets in the array [2,4,6].'''
nums = [2,4,6]
k = 2
x=0
res=len(nums)
for i in range(len(nums)):
    for j in range(i,len(nums)):
        print(nums[i],nums[j])
        #if(abs(nums[i]-nums[j]))==k:
            
