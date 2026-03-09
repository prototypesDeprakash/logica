arr=[1,2,3,1,2]
k=3


def sol1():
    for i in range(0,len(arr)):
        for j in range(0,len(arr)):
            if(i!=j and arr[i]==arr[j] and k==abs(i-j)):
                return True
    return False

print(sol1())