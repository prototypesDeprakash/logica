remainder={0:-1}
total=0
nums = [23,2,4,6,7]
k = 6
for i , n in enumerate(nums):
    total+=n
    r=total%k
    if r not in remainder:
        remainder[r]=i
    elif i-remainder[r]>1:
        print( True)
        exit()
print(False)