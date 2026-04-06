def nonegative(arr):
    for i in arr:
        if(i<=0):
            return False
    return True
maxprod=0
def arrayprod(arr):
    res=1
    for i in arr:
        res*=i
    return res
def subarrays(arr):
    global maxprod
    n = len(arr)
    
    for i in range(n):          # start index
        for j in range(i, n):   # end index
            #print(arr[i:j+1])
            if(nonegative(arr[i:j+1])):
                maxprod=max(maxprod,arrayprod(arr[i:j+1]))
            


subarrays([-2, -3, 4])
print(maxprod)