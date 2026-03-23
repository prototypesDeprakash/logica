arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]

jumps=1


# for i in range(0,len(arr)):
#     x=arr[i]
#     if(arr[x]<len(arr)):
#         jumps+=1
    
# print(jumps)
maxjump=0

for i in range(0,len(arr)-1):
    if(maxjump<i):
        maxjump = max(maxjump,arr[i]+i)
    else:
        print("fase")
print(maxjump)


