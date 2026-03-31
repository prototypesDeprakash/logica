A= int(input())
B=int(input())

def checkpal(n):
    n=str(n)
    if(n!=n[::-1]):
        return False
    return True
for i in range(A,B+1):
    if(checkpal(i)):
        print(i,end=" ")