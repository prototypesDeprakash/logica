arr=[1,1,1,2,2,100]
dict={}
k=2
bucket=[[] for i in range(0,len(arr)+1)]

for i in arr:
    dict[i]=dict.get(i,0)+1
for key,value in dict.items():
    bucket[value].append(key)
res=[]
for i in range(len(bucket)-1,0,-1):
    for n in bucket[i]:
        res.append(n)
        if(len(res)==k):
            print( res)

print(bucket)

