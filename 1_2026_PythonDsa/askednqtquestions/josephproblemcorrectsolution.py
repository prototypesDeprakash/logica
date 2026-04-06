arr = [1,2,3,4,5,6,7]
k = 3

inc = 0

while len(arr) != 1:
    inc = (inc + k - 1) % len(arr)
    arr.pop(inc)

print(arr[0])