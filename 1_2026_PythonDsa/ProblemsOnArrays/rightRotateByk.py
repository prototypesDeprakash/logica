arr=[1,2,3,4,5]
k=2

'''
Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
Output (Left Rotation) : {3, 4, 5, 1, 2}
Explanation : After rotating left by 2, the first two elements move to the end.'''
cut=k%len(arr)

x=arr[0:cut]
y=arr[cut:len(arr)]
print(y+x)