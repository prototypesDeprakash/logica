n=int(input())
arr=[]
for i in range(n):
    arr.append(list(map(int,input().split(" "))))

def is_same(arr):
    s=arr[0]
    for i in range(1,len(arr)):
        if(arr[i]!=s):
            return False
        s=arr[i]
    return True
for i in arr:
    if(is_same(i)):
        print("YES")
    else:
        print("NO")
    
    
        

    

