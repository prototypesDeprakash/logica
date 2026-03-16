nums = [100,4,200,1,3,2]
seen=set(nums)
maxseq=0

for num in seen:
    if(num-1 not in seen):
        length=1
        while(num+length in seen):
            length+=1
        maxseq=max(maxseq,length)

print(maxseq)
