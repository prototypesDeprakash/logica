arr = [1,2,3,1]
k = 3

def sol():
    window = set()
    for i in range(0,len(arr)):
        if(arr[i] in window):
            return True
        window.add(arr[i])
        if(len(window)>k):
            window.remove(arr[i-k])
    return False
print(sol())