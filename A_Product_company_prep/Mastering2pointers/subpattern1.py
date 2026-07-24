#Pattern A: Opposite ends, converging inward

arr=[1,2,3,4,5,6,7]
target =9
#only for sorted array
def tow_sum(arr,target):
    left =0
    right = len(arr)-1
    while(left<right):
        summ = arr[left]+arr[right]
        if(summ==target):
            return [left,right]
        elif summ<target:
            left+=1
        else:
            right-=1
    return [-1,-1]

