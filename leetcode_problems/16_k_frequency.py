'''
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
'''
nums = [1,1,1,2,2,3]
num=set(nums)
num=list(num)

k=2
freq=[0]*len(nums)
for i in range(0,len(nums)):
    freq[nums[i]]+=1
print(freq)

for i in range(0,len(nums)):
    dic+={nums[i]:freq[i]}
print(dic)


    