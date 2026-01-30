dic = {}

dic["mykey1"] = 1
dic["mykey2"]=2

print(dic.get("mykey1"))

for i in dic:
    print(dic.get(i))

print(dic.items())
for i , j in dic.items():
    print(str(i)+" "+str(j))

#enumerate basics 
s = [1,2,3,4,5,6,7,8,9,10]
for i , num in enumerate(s):
    print(i,num)


arr =[2,7,11,15]
target=9
hashmap={}

for i , j in enumerate(arr):
    comp = target-j
    if(comp in hashmap):
        print([hashmap[comp] , i])
    hashmap[j]=i
print(hashmap)
# pair =0
# for i , j in enumerate(arr):
#     complement = target-j
#     if(complement in hashmap):
#         pair+=1
#     hashmap[j]=i
