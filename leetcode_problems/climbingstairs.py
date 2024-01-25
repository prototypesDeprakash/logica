'''
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
'''

n=5

'''for i in range(0,n):
    for j in range(i+1,n):
            x.append(i+j)
print(x[-1])
y=x[len(x)-1]
if(n==2):
    print(y+1)
else:
    print (y)'''

x=[0]*(n+1)
x[0]=x[1]=1
for i in range(2,n+1):
    x[i]=x[i-1]+x[i-2]
print(x)