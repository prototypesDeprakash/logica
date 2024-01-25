'''
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
'''
n=[1,1,1,2,2,2]
n2=[]
for i in range(0,len(n)):
    if(n[i] not in n2):
        n2.append(n[i])

k=len(n2)


print(n2)
n1=n2
print(n1)
print(k)
