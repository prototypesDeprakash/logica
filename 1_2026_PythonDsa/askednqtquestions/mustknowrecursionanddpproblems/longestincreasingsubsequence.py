#subsequence program
s="3 4 2 8 10"
arr=list(map(int,s.split()))

def is_increasing(arr):
    for i in range(1,len(arr)):
        if(arr[i]<=arr[i-1]):
            return False
    return True

maxlength=0

def printallsubsequence(i,path):
    global maxlength
    if(i==len(arr)):
        if(is_increasing(path)):
            maxlength=max(maxlength,len(path))
        return
    printallsubsequence(i+1,path+[arr[i]])
    printallsubsequence(i+1,path)
printallsubsequence(0,[])

print(maxlength)