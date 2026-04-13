arr=[1,2,3,4,5]

def printSubarray(arr):
    for i in range(0,len(arr)):
        for j in range(i,len(arr)):
            print(arr[i:j+1])


def printsubsequences(i,arr,path):
    if(i==len(arr)):
        print(path)
        return
    printsubsequences(i+1,arr,path+[arr[i]])
    printsubsequences(i+1,arr,path)
printsubsequences(0,arr,[])

#optimal solution

def subarraySum(self, arr, k):
        prefix_map = {}
        prefix_map[0] = 1
        
        curr_sum = 0
        count = 0
        
        for i in range(len(arr)):
            curr_sum = curr_sum + arr[i]
            
            needed = curr_sum - k
            
            if needed in prefix_map:
                count = count + prefix_map[needed]
            
            if curr_sum in prefix_map:
                prefix_map[curr_sum] = prefix_map[curr_sum] + 1
            else:
                prefix_map[curr_sum] = 1
        
        return count

def sol(arr,k):
    prefix_map={}
    prefix_map[0]=1
    cursum=0
    count=0
    for i in range(0,len(arr)):
        cursum+=arr[i]
        needed=cursum-k
        if(needed in prefix_map):
            count+=prefix_map[needed]
        if(cursum in prefix_map):
            prefix_map[cursum]+=1
        else:
            prefix_map[cursum]=1
    return count

