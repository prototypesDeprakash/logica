n= int(input())

arr=[]
level=0
for i in range(0,n):
    arr[i]=int(input())
current_level = max(arr)
print(current_level)
while(current_level!=-1):
    level+=1
    current_level=arr[current_level]
print(level)
    