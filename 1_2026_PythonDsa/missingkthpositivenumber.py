arr = [1,2,3,4]
k = 2

missingnumbers=[]
i=1
while(len(missingnumbers)<k):
   
    if(i not in arr):
        missingnumbers.append(i)
    i+=1
print(missingnumbers)
print(missingnumbers[k-1])


        