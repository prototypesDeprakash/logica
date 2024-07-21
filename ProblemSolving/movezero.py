num=[0,1,2,0,3]
arr=[]
count=0
for i in num:
    if(i not in arr and i!=0):
            arr.append(i)
    if(i ==0 ):
            count+=1
for i in range(0,count):
        arr.append(0)
print(arr)

           

        