arr = [2,7,11,15]
target = 9

def sol1():
    l=0
    r=len(arr)-1

    while(l<r):
        total=arr[l]+arr[r]
        if(total==target):
            return[l+1,r+1]
        elif(total<target):
            l+=1
        else:
            r-=1
print(sol1())