'''
Print all subsets
Subset sum = target (true/false)
Count subsets with given sum
Maximum subset sum ≤ K ⭐ (your question)
Partition equal subset sum
Subsets with duplicates
Combination Sum (LeetCode)
Combination Sum II
Generate all binary subsets
Pick k elements from array

'''

def printAllSubset(i , arr, path):
    if(i==len(arr)):
        print(path)
        return
    #take
    printAllSubset(i+1,arr,path+[arr[i]])

    #nottake
    printAllSubset(i+1,arr,path)
#printAllSubset(0,[1,2,3],[])



res=[]

def allsubsets(i,arr,path):
            
    if(i==len(arr)):
        res.append(path)
        return 
            #take
    allsubsets(i+1,arr,path+[arr[i]])

            #not take
    allsubsets(i+1,arr,path)

# allsubsets(0,[1,2,3,4],[])
# sol=False
# for i in res:
#     if(sum(i)==target):
#         sol=True
#         break
#     sol=False
# print(sol)
target=9
def subsetsum(i, arr,target):
    if(target==0):
        return True
    if(i==len(arr)):
        return False
    return subsetsum(i+1, arr , target-arr[i]) or subsetsum(i+1,arr,target)
#print(subsetsum(0,[1,2,3],target))


def countsubsetsumequaltarget(i, arr, target):
    if(i==len(arr)):
        if(target==0):
            return 1 
        return 0
    
    return countsubsetsumequaltarget(i+1 , arr, target-arr[i]) + countsubsetsumequaltarget(i+1,arr,target)
#print(countsubsetsumequaltarget(0,[1,1,1,1,1],2))

# maximum sum subset

res=[]
k=5
def maximumsubsetsub(i , arr , path):
    if(i==len(arr)):
        res.append(path)
        return
    maximumsubsetsub(i+1,arr,path+[arr[i]])
    maximumsubsetsub(i+1,arr,path)
maximumsubsetsub(0,[2,3,-2,4],[])
print(res)
maxsum=float('-inf')
for i in res:
    cursum=sum(i)
    if(cursum<=k):

        maxsum=max(maxsum,cursum)
    
print(maxsum)
