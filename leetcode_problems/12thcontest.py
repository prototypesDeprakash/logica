n = 2
a = [[0 for _ in range(n)] for _ in range(n)]
k=0
for i in range(n):
    for j in range(n):
        
        a[i][j] = k
        k+=1
    
i=0
j=0
commands = ["RIGHT","DOWN"]
#commands = ["DOWN","RIGHT","UP"]
# for cmd in commands:
#     if(cmd=="DOWN"):
#         if(i+1 < n):
#             i+=1
#         elif(cmd=="RIGHT"):
#             if(j+1 <n):
#                 j+=1
#         elif(cmd=="UP"):
#             if(i-1 >=0):
#                 i-=1
        
#         elif(cmd=="LEFT"):
#                 if(j-1>=0):
#                     j-=1
for cmd in commands:
    if cmd == "DOWN":
        if i + 1 < n:  
            i += 1
    elif cmd == "RIGHT":
        if j + 1 < n:  
            j += 1
    elif cmd == "UP":
        if i - 1 >= 0:  #
            i -= 1
    elif cmd == "LEFT":
        if j - 1 >= 0:  # Check if moving left is within bounds
            j -= 1

        
print(a[i][j])
for i in a:
    print(i)