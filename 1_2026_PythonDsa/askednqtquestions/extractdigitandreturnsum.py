def countdigit():
    s=input()
    res=0
    for i in s:
        if str.isdigit(i):
            res+=int(i)
    print(res)

def secondlargestnumber(arr):
    arr.sort()
    print(arr[len(arr)-2])
secondlargestnumber([9,4,3,5,6,22])


        
