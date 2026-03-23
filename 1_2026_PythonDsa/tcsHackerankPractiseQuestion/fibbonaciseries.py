#0 , 1 , 1 , 2 , 3, 5 , 8, 13


n=int(input())
m=int(input())
a=0
b=1

summ=0
for i in range(1,m+1):
    if(i>=n):
        summ+=a
    a,b=b,a+b
    
print(summ)


    
    