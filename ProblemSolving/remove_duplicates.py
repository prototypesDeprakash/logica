arr=[1,2,3,4,4,5,5,1,2,3]
'''arr2=[]
for i in range(len(arr)):
    if(arr[i] not in arr2):
        arr2.append(arr[i])
print(arr2)'''
arr2=[]
arr.sort()
start=0
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i]==arr[j]):
            arr[j]=0
            start+=1
arr.sort()
print(start)
print(arr)
print(arr[start::])


  

    