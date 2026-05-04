#highest frequency , smallest number

n=int(input())
arr=list(map(int,input().split()))

hashmap ={}
highestfreq=float("-inf")
for i in arr:
  hashmap[i]=hashmap.get(i,0)+1
 
for i in hashmap:
  highestfreq=max(highestfreq,hashmap.get(i))

minnumber=float("inf")

for  i in hashmap:
  if(hashmap.get(i) == highestfreq):
    minnumber=min(minnumber,i)
print(minnumber)


