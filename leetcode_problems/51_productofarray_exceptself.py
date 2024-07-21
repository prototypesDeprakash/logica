'''
Given an integer array nums, return an array answer such that answer[i] is equal to the
 product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]'''


#complexity is too hign o(n^2)
'''
res=[1]*len(nums)
for i in range(len(nums)):
    #print("i=",nums[i])
    for j in range(len(nums)):
        if(i !=j):
            #print("j=",nums[j])
            res[i]*=nums[j]
print(res)
'''
nums = [1,2,3,4]

left=[1]*len(nums)
right=[1]*len(nums)
for i in range(1,len(nums)):
    left[i]=left[i-1]*nums[i-1]

for i in range(len(nums)-2,-1,-1):
    right[i] = right[i + 1] * nums[i + 1]
print(left)
print(right)
x=[]
for i in range(len(left)):
    x.append(left[i]*right[i])
print(x)