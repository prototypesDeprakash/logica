count=0
def binarystring(N,s):
    global count
    if(N==0):
        count+=1
        return
    binarystring(N-1,s+"1")
    binarystring(N-1,s+"0")

binarystring(4,"")
print(count)