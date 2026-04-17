arr=list(map(int,input().split()))

seen=set()
res=[]
for i in arr:
    
    if(i not in seen):
        res.append(i)
        seen.add(i)
print(*res[::-1])

