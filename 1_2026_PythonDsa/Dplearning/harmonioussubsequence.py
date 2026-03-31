
maxlength=float('-inf')
def generateallsubsequence(i,arr,s):
    global maxlength
    if(i==len(arr)):

        if len(s) > 0 and max(s) - min(s) == 1:
            maxlength=max(maxlength,len(s))
        return
    
    generateallsubsequence(i+1,arr,s+[arr[i]])
    generateallsubsequence(i+1,arr,s)


nums = [1,3,2,2,5,2,3,7]
generateallsubsequence(0,nums,[])
print(maxlength)
