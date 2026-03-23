arr=[1,2,3,5,6,4,7]
target = 9 
hashmap={}
for index , number in enumerate(arr):
    complement = target-number
    if(complement in hashmap):
        print(hashmap[complement] , index)
    hashmap[number]=index
