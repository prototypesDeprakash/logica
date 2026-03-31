
count =0

def findallSequence(N, R , s):
    global count
    if(N==0):
        count+=1
        print(s)
        return
    for i in range(1,R+1):
        if(len(s)==0 or s[-1]!=i):
            findallSequence(N-1,R,s+[i])
findallSequence(4,3,[])
print(count)
