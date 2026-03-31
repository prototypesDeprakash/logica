

#generate all arrangement 1to R , N position
count =0
def generateallcomb(N,R,s,end):
    global count
    if(N==0):
        
        if(s[-1]==end):
            print(s)
            count+=1
        return
    for i in range(1,R+1):
        #remove adjacency
        if(len(s)==0 and i!=1):
            continue
        if(len(s)>0 and s[-1]==i):
            continue
        generateallcomb(N-1,R,s+[i],end)

generateallcomb(4,4,[],3)
print(count)
