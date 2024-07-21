'''Intersection of Two Arrays II
Easy
Topics
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 '''
'''nums1 =[1,2,2,1]
ans=[]
nums2= [2,2,1,1]


if(len(nums1)<len(nums2)):
    for i in nums1:
        if i in nums2:
            ans.append(i)
else:
    for i in nums2:
        if i in nums1:
            ans.append(i)

print(ans)
'''
'''frq=[0]*10
for i in nums2:
    frq[i]+=1
print(frq)'''
def customprint(a):
    print(a)
customprint("hello bro")
def sums(a):
    a+=1
    if a<10:
        sums(a)
        print(a)
    
sums(1)

