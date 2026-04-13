# n = int(input())

# arr=list(map(int,input().split(" ")))

arr=[1,2,3,4]

freqarr=[0]*(max(arr))
print(freqarr)


for i in arr:
    freqarr[i-1]+=1
print(freqarr)

currentsize=freqarr[0]
currentelement=-1
for i in range(0,len(freqarr)):
    if(freqarr[i]>currentsize):
        currentsize=freqarr[i]
        currentelement=i+1
if currentsize > len(arr)//2:
    print(currentelement)
else:
    print(-1)