n=[0,1,0,3,12]
for i in range(0,len(n)):
    for j in range(i+1,len(n)):
        if(n[i]==0):
            n[j],n[i]=n[i],n[j]
print(n)