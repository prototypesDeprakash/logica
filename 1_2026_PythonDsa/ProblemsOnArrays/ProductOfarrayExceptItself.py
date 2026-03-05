arr=[1,2,3,4]

#prefix
prefix=[0 for i in range(len(arr))]
prefix[0]=1
for i in range(1,len(arr)):
    prefix[i]=prefix[i-1]*arr[i-1]
print(prefix)

#postfix
postfix=[0 for i in range(len(arr))]
postfix[len(arr)-1]=1
for i in range(len(arr)-2,-1,-1):
    postfix[i]=postfix[i+1]*arr[i+1]
print(postfix)
res=[0 for i in range(len(arr))]

for  i in range(0,len(res)):
    res[i]=prefix[i]*postfix[i]
print(res)