arr=[2,2,2,5,5,8,7,8,5,2,9,1,2,9]
arr2=[]
for i in range(len(arr)):
    if(arr[i] not in arr2):
        arr2.append(arr[i])
print(arr2)

for i in range(len(arr2)):
    cot=0
    for j in range( len(arr)):
        if(arr2[i]==arr[j]):
            cot+=1
    print(arr2[i]," is repeated ",cot," times ")

    