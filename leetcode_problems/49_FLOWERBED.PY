'''You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1
 means not empty, and an integer n, return true if n new flowers can be planted in the 
 flowerbed without violating the no-adjacent-flowers rule and false otherwise.
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false'''
'''if(flowerbed[0]==1):
    for i in range(0,len(flowerbed),2):
        if(flowerbed[i]==0 and n>0):
            flowerbed[i]+=1
            n-=1
else:
    for i in range(1,len(flowerbed),2):
        if(flowerbed[i]==0 and n>0):
            flowerbed[i]+=1
            n-=1
#common
n2=0
for i in range(0,len(flowerbed)-1):
    if(flowerbed[i]==flowerbed[i+1] and flowerbed[i]==1 and flowerbed[i+1]==1):
        n2+=1
print(n2)
print(n)
print(flowerbed)/
'''
'''flowerbed = [0,1,0,1,0,1,0,0]
n =1
if n==0:
    print("true")
for i in range(len(flowerbed)):
    if(flowerbed[i]==0):
        if(flowerbed[i+1]==0 ):
            flowerbed[i+1]=1
            n-=1
        elif(flowerbed[i-1]==0):
            flowerbed[i-1]=1
            n-=1
print(flowerbed)'''

'''
if n == 0:
    print("true")

for i in range(len(flowerbed)):
    if flowerbed[i] == 0:
        if i + 1 < len(flowerbed) and flowerbed[i + 1] == 0:
            flowerbed[i + 1] = 1
            n -= 1
        elif i - 1 >= 0 and flowerbed[i - 1] == 0:
            flowerbed[i - 1] = 1
            n -= 1
print(flowerbed)
if(n==0):
    print("true")
else:
    print("false")'''
flowerbed = [0,1,0,1,0,1,0,0]
n = 1

f=[0]+flowerbed+[0] #increases space complexity but works fine

for i in range(1,len(flowerbed)+1):
    if(f[i-1]==0 and f[i+1]==0 and f[i]!=1 and n>0):
        f[i]=1
        n-=1

if(n==0):
    print("true")
else:
    print("false")


