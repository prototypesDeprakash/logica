'''
Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 
 '''
nums = [7,9,7,4,2,8,7,7,1,5]
nums.sort()
freq=[0]*10
for i in range(len(nums)):
    freq[nums[i]]+=1
dup=0
for i in range(len(freq)):
    if(freq[i] > dup):
        dup=(freq[i])
ind=freq.index(dup)
print(ind)
print(nums[ind])
