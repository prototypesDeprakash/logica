a=[2,3,4,5,1]
n=len(a)
c=0
for i in range(n):
    if(a[i]>a[i+1]%n):
        c+=1
if(c==1):
    