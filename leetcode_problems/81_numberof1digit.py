n=824883294
res=0
for i in range(1,n+1):
    res+=str(i).count('1')
print(res)