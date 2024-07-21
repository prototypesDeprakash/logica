res=0
hours =[12,12,30,24,24]
for i in range(0,len(hours)):
    for j in range(i+1,len(hours)):
            if((hours[i]+hours[j])%24==0):
                res+=1
        
print(res)

