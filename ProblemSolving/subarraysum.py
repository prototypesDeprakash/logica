arr= [5,4,-1,7,8]
summ=[]
for i in range(len(arr)):
    for j in range(i,len(arr)):
        current_sum=sum(arr[i:j+1])
        summ.append(current_sum)
        
print(max(summ))
print(summ)
