arr= [4,5,0,-2,-3,1]
k = 5
sums=0

c=0
for i in range(len(arr)):
    for j in range(i,len(arr)):
        sums=0
        for f in range(i,j+1):
            
            sums+=arr[f]
        if(sums%k==0):
            c+=1
        


print(c)