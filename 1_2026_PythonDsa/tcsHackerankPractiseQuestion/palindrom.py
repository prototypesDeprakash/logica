a="mallam"
c=a
l=0
a=[i for i in a]
r=len(a)-1
while(l<r):
    a[l],a[r]=a[r],a[l]
    l+=1
    r-=1
a="".join(a)
print(a)
print(c)
print(a==c)
