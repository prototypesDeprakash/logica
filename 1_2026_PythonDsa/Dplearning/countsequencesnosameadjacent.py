
count =0
def countseqnosameadj(n,r,s):
    global count

    if(n==0):
        print(s)
        count+=1

        return 
    
    for i in range(1,r+1):
        if(len(s)==0 or s[-1]!=i):
            countseqnosameadj(n-1,r,s+[i])

countseqnosameadj(2,2,[])
print(count)

