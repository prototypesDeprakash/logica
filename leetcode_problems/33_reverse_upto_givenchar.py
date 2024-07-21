'''
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
'''

word = "abcdefd"

ch = "d"
#x=(word.index(ch))
x=1
for i in word:
    if(i==ch):
        break
    else:
        x+=1
revword=word[0:x]
word=word[x::]
print(revword[::-1]+word)



