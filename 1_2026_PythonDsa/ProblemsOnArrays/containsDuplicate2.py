arr = [1,2,3,1,2,3]
k = 2



def  hashingSolution():
    hashmap={}
    for index , number in enumerate(arr):
        if(number in hashmap and abs(hashmap[number]-index)<=k):
            return True
        else:
            hashmap[number]=index
    return False
print(hashingSolution())
