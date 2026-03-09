arr=[1,2,3,4,5,6,7,8]
target = 9


def solution():
    hashmap={}
    for index, number in enumerate(arr):
        complement = target-number
        if(complement in hashmap):
            return [hashmap[complement] ,index]
        hashmap[number]=index
print(solution())
        

        

    

