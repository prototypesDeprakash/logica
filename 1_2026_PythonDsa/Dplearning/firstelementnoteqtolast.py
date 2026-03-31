count=0
def countfirstnotequallast(N,R,s):
    global count
    if(N==0):
        if(s[0]!=s[len(s)-1]):
            count+=1
            print(s)
        return
    for i in range(1,R+1):
        countfirstnotequallast(N-1,R,s+[i])
countfirstnotequallast(3,2,[])
print(count)