'''
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all 
elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are
the same as in arr2. Elements that do not appear in arr2 should be placed at the end of
arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
Example 2:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]

'''
arr1 = [2,3,1,3,2,4,6,7,9,2,19]
arr2 = [2,1,4,3,9,6]

freq={}
for num in arr1:
    if(num in freq):
        freq[num]+=1
    else:
        freq[num]=1
#print(freq)

res =[]
for num in arr2:
    while(num in freq and freq[num]>0):
        res.append(num)
        freq[num]-=1
rem = sorted(freq.keys())

for key in freq.keys():
    if freq[key] == 1:
        res.append(key)
print(res)

