'''
Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.'''


'''for i in range(0,len(nums)-3):
    print(nums[i],nums[i+1],nums[i+2])
    if(nums[i]<nums[i+1]<nums[i+2]):
        print(nums[i],nums[i+1],nums[i+2])

        '''
nums = [2,1,5,0,4,6]

num1=float("inf")#0
num2=float("inf")#5
     
for i in nums:
    if i <num1:
        num1=i  
    elif(num1 < i < num2):
        num2=i
    elif(i>num2):
        print("True")
        exit()
print("false") 
  