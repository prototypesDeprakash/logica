'''
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
'''

x=123
xb=x
new=0
temp=0
y=x.bit_length()
print(y)
if(-y <= x <= y - 1):
    if(x<0 or x>0):
        x=abs(x)
        while(x!=0):
            temp=x%10
            new=new*10+temp
            x=x//10



    if(xb<0):
        print(-new)
    else:
        print(new)




   
else:
     print(0)

    