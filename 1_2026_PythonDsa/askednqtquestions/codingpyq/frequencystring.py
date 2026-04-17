arr=list(map(str,input().split()))

hashmap={}
for i in arr:
  hashmap[i]=hashmap.get(i,0)+1
  
for i in hashmap:
  print(str(i)+" "+str(hashmap.get(i)) , end=" ")
  
  