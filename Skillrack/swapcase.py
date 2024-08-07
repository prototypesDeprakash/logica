x="Hello bro"
x=x.split()
l1=x[0]
l1=l1.swapcase()
y=""
for i in range(1,len(x)):
    y+=" "
    y+=x[i]
print(l1+y)