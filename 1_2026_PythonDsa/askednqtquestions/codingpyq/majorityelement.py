n = int(input())
arr=list(map(int ,input().split()))

major=n//2
element =0
hashmap = {}

for i in arr:
    hashmap[i]=hashmap.get(i,0)+1

for i in hashmap:
    if(hashmap.get(i))>=major:
        print(i, end =" ")
