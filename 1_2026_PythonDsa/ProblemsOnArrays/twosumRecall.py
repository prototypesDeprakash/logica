arr=[1,2,3,4,5,6,7,8]
target=9

dict={}
for i in range(0,len(arr)):
    comp=target-arr[i]
    if(comp in dict):
        print([dict[comp] , i])

    dict[arr[i]]=i