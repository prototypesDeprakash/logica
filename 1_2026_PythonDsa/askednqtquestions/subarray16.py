arr=list(map(int,input().split(" ")))
n=len(arr)
k=int(input())
maxelement=[]
for i  in range(n):
    for j in range(i,n):
        if(len(arr[i:j+1])==k):
            maxelement.append(max(arr[i:j+1]))
        
for i in maxelement:
    print(i,end=" ")