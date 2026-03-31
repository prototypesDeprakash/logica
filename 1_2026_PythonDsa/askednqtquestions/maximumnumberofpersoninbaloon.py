
arr=[40,50,60,30,20]
limit =100

x=sorted(arr)
#print(x)

i=0
count=0
cursum=0
while(i<len(x)):
    if(cursum+x[i]<=limit):
        cursum+=x[i]
      #  print(x[i])
        count+=1
    else:
        break
    i+=1
#print(cursum)
print(count)
    