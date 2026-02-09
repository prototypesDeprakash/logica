inpt = "is1 thi0s t3est 2a"

words=[]
word_only=[]
numbers=[]
words = inpt.split(" ")
print(words)

for i in words:
    w=""
    for x in i:
        if(x.isdigit()):
            numbers.append(x)
        else:
            w+=x
    word_only.append(w)
print(word_only)
print(numbers)

for i in numbers:
    print(word_only[int(i)] , end =" ")

# dictmap ={}
# for i in range(0,len(word_only)):
#     dictmap[int(numbers[i])]=word_only[i]
# print(dictmap)
# y = sorted(dictmap)
# print(y)

# for i in range(0,len(dictmap)):
#     print(dictmap.get(y[i]), end=" ")