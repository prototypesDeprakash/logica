n=int(input())
datas=[]

for i in range(n):
    datas.append(list(map(str,input().split())))

fcount=0
fgrade=0
for i in datas:
    if(int(i[1])>20):
        print(i[0])
    if(i[3]=="Female"):
        fgrade+=int(ord(i[2]))
        fcount+=1
print(fgrade/fcount)
        
    
    
    
