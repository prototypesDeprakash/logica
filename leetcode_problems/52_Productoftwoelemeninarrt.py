'''
Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 '''
#Use brute force: two loops to select i and j, then select the maximum value of
# (nums[i]-1)*(nums[j]-1).
nums = [3,4,5,2]
x=[]
for i in range(len(nums)):
    for j in range(len(nums)):
         if(i !=j):
              #print((nums[i]-1)*(nums[j]-1))
              x.append((nums[i]-1)*(nums[j]-1))
print(max(x))
x