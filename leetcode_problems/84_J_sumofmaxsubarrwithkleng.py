'''
Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
'''
nums = [1,5,4,2,9,9,9]
k = 3
l=0
r=k
found=False

maxsum=float('-inf')
while r <= len(nums):
    subarray = nums[l:r]
    
    # Check for duplicates in the subarray
    if len(set(subarray)) == k:
        cs = sum(subarray)
        maxsum = max(cs, maxsum)
        found=True
    
    l += 1
    r += 1
print(maxsum)
    
