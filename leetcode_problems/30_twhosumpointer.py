'''
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
'''

numbers =[2,7,11,15]
target =9
'''for i in range(len(numbers)):
    for j in range(i+1,len(numbers)):
        #print(numbers[i],numbers[j])
      
        if(numbers[i]+numbers[j])==target:
            #print([numbers.index(numbers[i]),numbers.index(numbers[j])])
            print([i+1,j+1])'''
            
l=0
r=len(numbers)-1
while l<r:
    current = numbers[l]+numbers[r]
    if(current<target):
        l+=1
    elif(current>target):
        r-=1
    else:
        print([l+1,r+1])
        break
    
    
