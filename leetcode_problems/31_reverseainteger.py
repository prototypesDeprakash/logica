'''
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21'''
x=1534236469



            
neg=0
        
if(x<0):
    neg+=1
x=abs(x)

temp=0
rev=0
while x>0:
    temp=x%10
    rev=rev*10+temp
    x=x//10

if(neg==1):
    rev*=-1
if rev > 2**31 - 1:
        print(0) 
else:
     print(rev)

