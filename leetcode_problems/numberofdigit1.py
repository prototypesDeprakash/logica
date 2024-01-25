'''
13 -1
12 -1
11 -2
10 -1
9
8
7
6
5
4
3
2
1 -1
total = 6
'''
'''x=[]
for i in range(0,n+1):
    
    x.append(str(i))

count=0
for i in range(len(x)):
    count+=x[i].count('1')

print(count)'''

n=13
count=0
for i in range(n + 1):
    count += str(i).count('1')
print(count)
