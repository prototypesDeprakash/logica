n=int(input())
arr=list(map(int , input().split()))
larg = max(arr)
ind = arr.index(larg)

small_before_max= min(arr[0:ind])

diff = larg - small_before_max
print(diff)
