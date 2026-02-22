matrix=[[1,2,3,4],[5,6,7,8],[9,10,11,12]]



result =[]
while matrix:
    result+=(matrix.pop(0))
for i in matrix:
    result+=(i.pop())
print(result)