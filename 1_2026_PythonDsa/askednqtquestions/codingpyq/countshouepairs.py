s="7L 7R 7L 8L 6R 7R 8R 6R"

arr = list(map(str ,  s.split()))

sizearr=[]
left_shoe={}
right_shoe={}
for i in arr:
    leg= i[1]
    size =int(i[0])
    sizearr.append(size)
    if(leg=="L"):
        
        left_shoe[size]=left_shoe.get(size,0)+1
    elif(leg=="R"):
        right_shoe[size] = right_shoe.get(size,0)+1

totalpair=0


sizearr=list(set(sizearr))
        
    
print(sizearr)
for i in sizearr:
    totalpair+=min(left_shoe.get(i, 0), right_shoe.get(i, 0))
    
print(totalpair)
    
    
        
        
