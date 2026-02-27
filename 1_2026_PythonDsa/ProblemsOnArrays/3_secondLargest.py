arr=[1,25,7,8,23,4,6,7,2,34,75]

firstLargst=float('-inf')
seconfLargest=float('-inf')

for i in arr:
    if(i>firstLargst):
        seconfLargest=firstLargst
        firstLargst=i
    elif(i>seconfLargest and i !=firstLargst):
        seconfLargest=i
print(seconfLargest)