matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target=60


# binary search
newarr=[i for x in matrix for i in x ]
print(newarr)
def binarySearch(arr):
    
    low =0
    high=len(arr)
    

    while(low<high):
        mid =(low+high)//2
        if(arr[mid]==target):
            return mid
        if(arr[mid]<target):
            low=mid+1
        if(arr[mid]>target):
            high=mid-1
print(binarySearch(newarr))