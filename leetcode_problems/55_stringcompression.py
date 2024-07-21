'''
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 '''
'''res={}
result=""    
for i in range(len(chars)):
    if(chars.count(chars[i])==1):
        result+=str(chars[i])
    else:
        res[chars[i]]=chars.count(chars[i])
chars.clear()
for x,y in res.items():
    pair=str(x)+str(y)
    result+=pair

chars.clear()
for i in result:
    chars.append(i)
print(chars)
'''
'''
chars =
["a","a","a","b","b","a","a"]

Use Testcase
Output
["a","5","b","2"]
Expected
["a","3","b","2","a","2"]'''


chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
i=0
r=0
res=[]
while i < len(chars):
    currchar=chars[i]
    currentcout=0
    while i<len(chars) and chars[i]==currchar:
        currentcout+=1
        i+=1
    chars[r]=currchar
    r+=1
    res.append(currchar)
    if(currentcout>1):
        curstr=str(currentcout)
        for j in range(len(curstr)):   
            res.append(curstr[j])
    
chars.clear()
chars+=res
print(chars)
    


