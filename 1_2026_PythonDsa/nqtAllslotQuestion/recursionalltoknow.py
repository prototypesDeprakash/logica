'''
Print numbers 1 to N
Factorial
Fibonacci
Sum of array
Reverse array (recursion)
Check palindrome
Power (x^n)
Print all subsequences (IMPORTANT)
Count subsequences
Print binary strings of length N

'''

def print1ton(n):
    if(n==0):
        return
    print1ton(n-1)
    print(n)
#print1ton(10)

def factorial(n):
    if(n==1 or n==0):
        return 1
    return n * factorial(n-1)
#print(factorial(5))

def fibbonaci(n):
    if(n==0):
        return 0
    if(n==1):
        return 1 
    return fibbonaci(n-1)+fibbonaci(n-2)

    # a=0
    # b=1
    # for i in range(0,n):
    #     c=a+b
    #     print(c)
    #     a=b
    #     b=c
#print(fibbonaci(3)) 

def sumofArray(i,sum,arr):
    
    
    if(i==len(arr)):
        return sum
    return sumofArray(i+1,sum+arr[i],arr)
#print(sumofArray(0,0,arr=[1,2,3,4,5]))

def reverseArray_norec(arr):
    r=len(arr)-1
    for i in range(0,len(arr)//2):
        arr[i],arr[r]=arr[r],arr[i]
        r-=1
    print(arr)
#reverseArray_norec([1,2,3,4,5,6,7,8,9,10])

def reverseArray(arr,l,r):
    if(l>=r):
        return arr 
    arr[l],arr[r]=arr[r],arr[l]
    return reverseArray(arr,l+1,r-1)
#print(reverseArray([1,2,3,4,5,6,7,8,9,10],0,9))

def chechPalindrom(s,l,r):
    if(l>=r):
        return True
    if(s[l]!=s[r]):
        return False
    
    return chechPalindrom(s,l+1,r-1)
#print(chechPalindrom("MOM",0,2))

def findpower(x,n):
    if(n==0):
        return 1
    return x*findpower(x,n-1)
#print(findpower(5,3))

count=0
def printallSubsequence(i,path):
    global count
    origarr=[1,2,3,4,5]
    if(i==len(origarr)):
        print(path)
        count+=1
        return
    printallSubsequence(i+1,path+[origarr[i]])
    printallSubsequence(i+1,path)
#printallSubsequence(0,[])
#printallSubsequence(0, [])
#print("count =", count)


def printBinaryStrings(i,n,path):
    if(i==n):
        print(path)
        return  
    printBinaryStrings(i+1,n,path+"1")
    printBinaryStrings(i+1,n,path+"0")
printBinaryStrings(0,2,"")



    



    
        


   


