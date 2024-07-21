'''
881. Boats to Save People
Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)'''


#[3,3,4,5]
'''
[3+5<=5] not so boat +=1
j-=1
[3+4] not so  boat +=1
j-=1
[3+3<=limit] no , boat +=1
again 3+3
boat+=1

lets take [1,2,2,3]
[1+3 <3 ] no , boat +=1 , j-=1
[1+2 <=3] yes , i+=1
[2+2<=3 ] no , boat+=1, j-=1
again 2+2
'''
people=[3,2,2,1]
people.sort()
limit = 3

boat=0
i=0
j=len(people)-1
while(i<=j):
     if(people[i]+people[j]<=limit):
        i+=1
    
     j-=1
     boat+=1
    
    
print(boat)
    
    

