'''
Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.
Example 2:

Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
Example 3:

Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.'''
#woring but time limit exceeded
'''nums = [-25,25,-27,45,31,46,46,21]
maxno=0

for i in range(len(nums)):
    for j in range(len(nums)):

        x=max(nums)
        if(x*-1 in nums):
            maxno=x
        elif(x*-1 not in nums):
            nums.remove(x)
if(maxno==0):
    print(-1)
else:
    print(maxno)'''
#another solution
nums = [-25,25,-27,45,31,46,46,21]
nums.sort()
n = len(nums)
for i in range(n-1, -1, -1):
    if nums[i] > 0 and -nums[i] in nums:
        print( nums[i])

print(-1)  # If no such pair found
