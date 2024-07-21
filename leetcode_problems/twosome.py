# arr=[2,7,11,15]
# for i in range(0,len(arr)):
#     for j in range(i+1,len(arr)):
#         #print(arr[i],arr[j])
#         if(arr[i]+arr[j]==9):
#             print(i,j)
        
arr=[11,15,2,7]

target=9
for i in range (0,len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i]+arr[j]==target):
            print(arr[i],arr[j])
            exit