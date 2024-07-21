'''a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]'''
a1=[10, 5, 2, 23, 19]
a2=[19, 5, 3]
n=len(a1)
m=len(a2)
#two pointer approach 
i=0
j=0

a1.sort() #[]
a2.sort()

while(i<n and j<m):
    if(a1[i] < a2[j]):
        i+=1
    elif(a1[i]==a2[j]):
        i+=1
        j+=1
    else:
        print("No")
        exit()
if(j==m):
    print("Yes")
else:
    print("No")
