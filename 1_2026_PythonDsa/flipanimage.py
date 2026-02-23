image = [[1,1,0],[1,0,1],[0,0,0]]
for i in image:
    list.reverse(i)
    for j in range(len(i)):
        if(i[j]==0):
            i[j]=1
        else:
            i[j]=0
#print(image)

res=[]
for i in image:
    i.reverse()
    res.append([x^1 for x in i])
print(res)
