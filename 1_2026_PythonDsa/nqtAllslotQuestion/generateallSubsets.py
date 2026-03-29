
arr=[1,2,3,4]
def dfs(i,path):
    if(i==len(arr)):
        print(path)
        return
    #take
    dfs(i+1,path+[arr[i]])
    #skip
    dfs(i+1, path)
dfs(0,[])