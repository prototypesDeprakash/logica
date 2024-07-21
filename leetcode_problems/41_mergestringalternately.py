'''
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
'''
word1="abcd"
word2="pq"
newstr=""
if(len(word1)>len(word2)):
    maxi=word1
    mini=word2
else:
    maxi=word2
    mini=word1
print(maxi)
x=len(maxi)

for i in range(x):
    try:
        newstr+=word1[i]+word2[i]
    except:
        newstr+=maxi[i]
        
print(newstr)
    

