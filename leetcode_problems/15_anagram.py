a="qwe"
b="ewe"
aa=[]
bb=[]
for x in a:
    aa.append(ord(x))
for x in b:
    bb.append(ord(x))
aa.sort()
bb.sort()
if(aa==bb):
    print("true")
else:
    print("false")

