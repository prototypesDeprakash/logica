from collections import Counter
arr=[1,2,1,2,1,2,3,1,3,2]
k=2
x=Counter(arr)
sorted_by_value =[[i, v] for i, v in sorted(x.items(), key=lambda item: item[1], reverse=True)]


print(sorted_by_value)
res=[]
for i in range (0,2):
    res.append(sorted_by_value[i][0])
print(res)