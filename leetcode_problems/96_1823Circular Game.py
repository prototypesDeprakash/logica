from collections import deque
n = 6
k = 5
q=deque()
for i in range(1,n+1):
    q.append(i)
while(len(q)>1):
    for i in range(0,k-1):
        q.append(q.popleft())
    q.popleft()
print(q[0])

