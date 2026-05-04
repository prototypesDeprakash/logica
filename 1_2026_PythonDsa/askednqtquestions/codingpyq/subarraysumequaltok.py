arr = list(map(int, input().split()))
k = int(input())

def allsubsequence(i , path):
    if(i==len(arr)):
        if(sum(path)==k):
            print(path)
        return
    allsubsequence(i+1,path+[arr[i]])
    allsubsequence(i+1,path)
#allsubarray(0,[])


def allsubarray():
    for i in range(0,len(arr)):
        for j in range(i,len(arr)):
            if(sum(arr[i:j+1])==k):
                print(arr[i:j+1])

def allsubarrayoptimal():
    cur_sum=0
    for i in range(0,len(arr)):
        cursum=arr[i]
        for j in range(i+1,len(arr)):
            cursum+=arr[j]
            if(cursum==k):
                print(arr[i:j+1])
allsubarrayoptimal()
        


    
                
