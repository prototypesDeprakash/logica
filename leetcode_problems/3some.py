x=[0,1,1]
y=set()

x.sort()
for i in range (0,len(x)):
    for j in range(i+1,len(x)):
        for k in range(j+1,len(x)):
            if(x[i]+x[j]+x[k]==0):
                y.add((x[i],x[j],x[k]))

z = [list(t) for t in y]
print(z)
