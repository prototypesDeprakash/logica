List=[[1,2,3],[4,5,6],[7,8,9]]
tlist=[]
for i in range(len(List[0])):
    trow=[]
    for r in List:
        trow.append(r[i])
    tlist.append(trow)
for n in tlist:
    print(n)