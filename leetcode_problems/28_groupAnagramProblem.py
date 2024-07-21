'''
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 '''
'''
grp = ["eat","tea","tan","ate","nat","bat"]

#converting to int
for i in range(len(grp)):
    newword=[]
    for j in range(len(grp[i])):
        newword.append(((ord(grp[i][j]))))
    grp[i]=newword
print(grp)
#sorting the int
for i in range(len(grp)):
    grp[i].sort()
print(grp)
#converting to character
for i in range(len(grp)):
    newword=""
    for j in range(len(grp[i])):
        newword+=(((chr(grp[i][j]))))
    grp[i]=newword
print(grp)
'''
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

anagrams = {}
for word in strs:
    sorted_word = ''.join(sorted(word))
    if sorted_word in anagrams:
        anagrams[sorted_word].append(word)
    else:
        anagrams[sorted_word] = [word]

output = [anagrams[key] for key in anagrams if len(anagrams[key]) > 1]

print(output)
