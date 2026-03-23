moveZeros=[1,1,0,3,0,0,1,1,2]
l=0
for r in range(0,len(moveZeros)):
    if(moveZeros[r]!=0):
        moveZeros[l],moveZeros[r]=moveZeros[r],moveZeros[l]
        l+=1

        
print(moveZeros)

        
        
