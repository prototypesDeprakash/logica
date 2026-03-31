
count=0
def countsubsequence(N,R,s,K):
    global count
    if(N==0):
        if(sum(s)<=K):
            count+=1
        
        return
    for i in range(1,R+1):
        countsubsequence(N-1,R,s+[i],K)
countsubsequence(3,3,[],4)
print(count)
    
