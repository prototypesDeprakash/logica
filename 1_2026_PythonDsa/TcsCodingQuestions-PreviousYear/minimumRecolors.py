blocks = "WBBWWBBWBW"
k = 7

window =0

for i in range(0,k):
    if(blocks[i]=="W"):
        window+=1
mincol=window
for i in range(k,len(blocks)):
    if(blocks[i-k]=="W"):
        window-=1
    if(blocks[i]=="W"):
        window+=1
    mincol=min(mincol,window)

print(mincol)