'''Input: numBottles = 9, numExchange = 3
Output: 13
'''
numBottles = 9
numExchange = 3
res=0
remaining=0
while numBottles >0:
    res+=numBottles
    remaining+=numBottles
    numBottles=remaining//numExchange
    remaining = remaining%numExchange
print(res)
#understandable solution
class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:

        ans=numBottles
        while(numBottles>=numExchange):
            rem=numBottles%numExchange
            numBottles =numBottles//numExchange
            ans+=numBottles
            numBottles+=rem
        return ans
''' res=0
        empty=0
        while numBottles>0:
            res+=numBottles
            empty+=numBottles
            numBottles = empty // numExchange #converting empty bottle to filled on (exchanging)
            empty = empty%numExchange

        return res'''
        
       
