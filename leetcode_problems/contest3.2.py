'''
Input: nums = [13,23,12]

Output: 4

Explanation:
We have the following:
- The digit difference between 13 and 23 is 1.
- The digit difference between 13 and 12 is 1.
- The digit difference between 23 and 12 is 2.
So the total sum of digit differences between all pairs of integers is 1 + 1 + 2 = 4.'''
nums = [13,23,12]
n=len(nums)
for i  in range(n):
    for j in range(i+1,n):
        print(nums[i],nums[i+1])
        
               