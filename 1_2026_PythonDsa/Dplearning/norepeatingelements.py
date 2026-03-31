
count=0
def norepeatingelements(N,R,s):
    global count
    if(N==0):
        count+=1
        print(s)
        return
    
    for i in range(1,R+1):
        if(len(s)>0 and i in s):
            continue
        norepeatingelements(N-1,R,s+[i])
norepeatingelements(3,3,[])
print(count)
