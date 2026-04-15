arr=[1,2,4,8]
maxsubset=0
def calcxor(arr):
    res=0
    for i in arr:
        res|=i
    return res
def subset(i,path):
    global maxsubset
    if (i==len(arr)):
        maxsubset=max(maxsubset,calcxor(path))
        #print(path)
        return
    subset(i+1,path+[arr[i]])
    subset(i+1,path)
subset(0,[])

print(maxsubset)


