
def binstringno1(n,s):
    if(n==0):
        print(s)
        return
    
    binstringno1(n-1,s+"0")

    if(len(s)==0 or s[-1]!="1"):
        binstringno1(n-1,s+"1")
    
binstringno1(3,"")