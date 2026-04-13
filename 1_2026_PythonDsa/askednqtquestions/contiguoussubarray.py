nums=list(map(int,input().split()))
k=int(input())
n=len(nums)
res=[]
def bruitforce():
    containsans=False
    for i in range(0,n):
        for j in range(i,n):
            if(sum(nums[i:j+1])==k ):
                res=(nums[i:j+1])
                containsans=True
    if(containsans):
        print(res)
    else:
        print(-1)

def slidingwindowOptimalApproach(arr):
    start=0
    currentsum=0
    found =False

    for end in range(n):
        currentsum+=arr[end]

        while(currentsum>k and start<=end):
            currentsum-=arr[start]
            start+=1
        if(currentsum==k):
            print(nums[start:end+1])
            found=True
            break
    if not found:
        print(-1)


slidingwindowOptimalApproach(nums)
            

    
