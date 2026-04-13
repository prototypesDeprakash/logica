n=int(input())

inputs=[]
for i in range(0,n):
    templist=list(input().split(" "))
    inputs.append(templist)
print(inputs)

nameofstudents=[]
AsciivaluesofFemale=[]
for  i in inputs:
    if(int(i[1])>20):
        nameofstudents.append(i[0])

        if(i[3]=="Female"):
            AsciivaluesofFemale.append(i[2])
averagemark=0
for i in AsciivaluesofFemale:
    averagemark+=ord(i)

for i in nameofstudents:
    print(i,end=" ")
print(averagemark/len(AsciivaluesofFemale))
    
    