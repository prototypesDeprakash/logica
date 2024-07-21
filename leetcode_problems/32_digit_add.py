'''
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.'''

'''temp=0
summ=0
s2=0
while num>0:
    temp=num%10
    summ+=temp
    num=num//10

while summ>0:
    temp=summ%10
    s2+=temp
    summ=summ//10

'''

num=199
def addnums(num):
    x=0
    while num>0:
        temp=num%10
        x+=temp
        num=num//10
    return(x)

while num>=10:
    num=addnums(num)
addnums(199)
print(num)

