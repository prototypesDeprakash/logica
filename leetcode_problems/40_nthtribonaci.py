'''
Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537'''
beg=[0,1,1]
n=4
if(n<3):
    print(0)

for i in range(3,n+1):
    beg[0]=beg[1]
    beg[1]=beg[2]
    beg[2]=sum(beg)
print(beg[2])
  