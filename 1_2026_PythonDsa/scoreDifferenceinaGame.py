nums = [2,4,2,1,2,1]
player1=True
player2=False

p1=0
p2=0

for i in range(0,len(nums)):
    if(nums[i]%2!=0):
        player1,player2=player2,player1
    if(i%6==5):
        player1,player2=player2,player1

    if(player1):
        p1+=nums[i]
    if(player2):
        p2+=nums[i]

print(p1-p2)
