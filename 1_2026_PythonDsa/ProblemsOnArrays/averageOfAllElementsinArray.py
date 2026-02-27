arr=[1,2,3,4,5,6,7,8,9,10]
print(sum(i for i in arr)/len(arr))
print(sum(arr)/len(arr) if arr else 0)

x=[i if i%2==0 else -999 for i in range(0,5) ]
print(x)