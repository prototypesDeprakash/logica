logs = ["d1/","d2/","../","d21/","./"]
#Output: 2

x=0
for i in logs:
    if(i=="../"):
        x-=1
        print(x)
    if(i=="./"):
        print("no op")
        x+=0
    
print(x)
