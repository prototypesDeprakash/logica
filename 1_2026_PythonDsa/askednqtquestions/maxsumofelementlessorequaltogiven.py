#generate subsets
count=0
maxy=0

def subsets(i,arr,s,k):
    global maxy
    global count
    if(i==len(arr)):
        count+=1
        
        if(sum(s)<=k):
            
            maxy=max(maxy,sum(s))
            #print(sol)

        return 
    
    #take
  
    subsets(i+1,arr,s+[arr[i]],k)
    
    #not take
    subsets(i+1,arr,s,k)

subsets(0,[4,8,6],[],9)
print(maxy)

        

