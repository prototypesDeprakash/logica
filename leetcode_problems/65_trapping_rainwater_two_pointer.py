height = [0,1,0,2,1,0,1,3,2,1,2,1]
n=len(height)
l=0
r=n-1
leftmax=0
rightmax=0
ans=0
while l<=r:
    leftmax=max(leftmax,height[l])
    rightmax=max(rightmax,height[r])
    if(leftmax<rightmax):
        ans+=leftmax-height[l]
        l+=1
    else:
        ans+=rightmax-height[r]
        r-=1
print(ans)
