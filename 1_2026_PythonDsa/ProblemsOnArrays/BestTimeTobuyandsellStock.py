arr = [7,6,4,3,1]

# best=float('-inf')
# for i in range(0,len(arr)):
#     for j in range(i,len(arr)):
#         best=max(best,arr[j]-arr[i])
# print(best)
        
min_num=min(arr)
max_num=max(arr)
if(arr.index(min_num)<arr.index(max_num)):
    print(max_num-min_num)
print(0)