def countsubsequence(n,r,s):
    if(n==0):
        print(s)
        return 1

    total=0

    for i in range(1,r+1):
        
        total+=countsubsequence(n-1,r,s+[i])
    return total
print(countsubsequence(2,2,[]))



   