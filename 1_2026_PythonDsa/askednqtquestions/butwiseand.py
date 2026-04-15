'''Given an array of integers nums, find the bitwise AND of all elements whose index is divisible
by 3. If no such elements exist, return -1.
Example 1:
Input:
nums = [3, 5, 9, 10, 11, 17, 15]
Output:
3
Explanation:
Indices divisible by 3: 0, 3, 6
Elements at these indices: [3, 10, 15]
3 & 10 & 15 = 3'''


arr= [4, 7, 8, 13, 21, 25]
res=-1
for  i in range(0,len(arr)):

    if(i%3==0):
        if res == -1:
            res = arr[i]
        else:
            res &= arr[i]
print(res)
