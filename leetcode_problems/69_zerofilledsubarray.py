'''
Number of Zero-Filled Subarrays
Input: nums = [1,3,0,0,2,0,0,4]
Output: 6
Explanation: 
There are 4 occurrences of [0] as a subarray.
There are 2 occurrences of [0,0] as a subarray.
There is no occurrence of a subarray with a size more than 2 filled with 0. Therefore, we return 6.
'''
nums = [1,3,0,0,2,0,0,4]
j=0
res=0
for i in range(0,len(nums)):
    if(nums[i]!=0):
        j=i+1
    res+=i-j+1
print(res)


    
