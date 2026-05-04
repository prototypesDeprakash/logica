def primenumber(number):
    if(number<2):
        return False
    for i in range(2,number):
        if(number%i==0):
            return False
    return True

arr=list(map(int, input().split()))
index_list=[]
for idx, val in enumerate(arr):
    if primenumber(val):
        index_list.append(idx)

print(max(index_list) - min(index_list))
