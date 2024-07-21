import random
a=[1,2,3,4,5,6,7]
k=7
x=random.randint(0,len(a)-1)
times=0
while(a[x]!=k):
    x=random.randint(0,len(a)-1)
    times+=1
    if(a[x]==k):
        print(a[x])
        print("element found")
        exit
print("found in ",times," attempt")