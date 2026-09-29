arr=[1,2,3,4,5,6,7,8]
target=9

def sol():
    for i in range(0,len(arr)): #(loops runs from 0 to len(arr)-1)
        for j in range(i+1,len(arr)): #(i+1 because we dont want i == j )
            if(arr[i]+arr[j]==target): 
                #checks if arr[i]+arr[j] == target , if yes then return its index
                return [i,j]
print(sol())


def optimal():
    hashmap ={}

    for i in range(0,len(arr)):
        complement  = target-arr[i] # what should i add with arr[i] to get target , ex 3+ ? => 9
        if(complement in hashmap): #if the number i need is already present in the hashmap 
            return[hashmap[complement],i] #return the value of the complement(index) and current index
        
        hashmap[arr[i]]=i # every iteration add the number as key and its index as value
print(optimal())