#two sum with binary search 

arr =[2,7,11,15]
target = 9

arr.sort()
def binarysearch(nums,n):
    low =0
    high = len(nums)-1
    while(low<=high):
        mid = (low+high)//2

        
       
        if(nums[mid]==n):
            return mid
        elif(nums[mid]>n):
            high=mid-1
        elif(nums[mid]<n):
            low=mid+1
    return -1
#print(binarysearch(arr,11))

for i , j in enumerate(arr):
    comp = target-j
    if(binarysearch(arr,comp) != -1 and binarysearch(arr,comp) !=i):
        print([binarysearch(arr,comp) ,i])


    
