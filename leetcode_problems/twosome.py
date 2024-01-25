arr=[2,7,11,15]
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        #print(arr[i],arr[j])
        if(arr[i]+arr[j]==9):
            print(i,j)
        