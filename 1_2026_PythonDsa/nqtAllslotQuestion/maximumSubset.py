# n=int(input())
# arr=[]
# for i in range(n):
#     x=int(input())
#     arr.append(x)

# print(arr)

# n=int(input())
# newarr=list(map(int,input().split()))
# print(newarr)
arr=[2,3,5,7]
maxsum =10
curmax=0
subset=[]

for i in range(0,len(arr)):
    x=0
    for j in range(i+1,len(arr)):
        y=0
        x+=arr[i]
        y+=x+arr[j]
        
        if(y<=maxsum):
            
            subset=[arr[i],arr[j]]
        else:
            subset=[x]
        
print(subset)




    
    

