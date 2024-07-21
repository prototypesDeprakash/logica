arr1=[5,4,3,7,45,54]
arr2=[56,44,90,7,65,77]
arr3=[i for i in range(len(arr1+arr2))]
i=0
j=0
k=0
while (i<len(arr1)):
    arr3[k]=arr1[i]
    k+=1
    i+=1
while(j<len(arr2)):
    arr3[k]=arr2[j]
    k+=1
    j+=1
arr3.sort()
print(arr3)
