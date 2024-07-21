mydick={}
s="tree"
for i in range(len(s)):
    mydick[s[i]]=s.count(s[i])
sorted_items = sorted(mydick.items(), key=lambda item: item[1], reverse=True)
#sorted_items = sorted(mydick.items(), reverse=True)
print(sorted_items)
res=""
# Print only the values (characters)
for count, char in sorted_items:
    res+=count*char
print(res)
