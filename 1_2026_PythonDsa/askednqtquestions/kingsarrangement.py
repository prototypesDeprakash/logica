#conditions
#first =1
#last = end         
#adjacents 1 to R+1
#no adjacents equal

count=0



def kingsArrangement(N,R,end,s):
    global count

    if(N==0):
        if(s[-1]==end):
            print(s)
            count+=1
            
        return
        
    for i in range(1,R+1):
        # first elemnt must be 1
        if(len(s)==0 and i!=1):
            continue
        # no adjacent elemnt
        if(len(s)>0 and s[-1]==i ):
            continue
        kingsArrangement(N-1,R,end,s+[i])
        
kingsArrangement(4,4,3,[])
print(count)
    
    
    

