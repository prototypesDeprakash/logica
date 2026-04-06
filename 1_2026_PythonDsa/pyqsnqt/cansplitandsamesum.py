

arr=[1,2,3,4,5]
x=sum(arr)
count=0
def generate_all_subsets(i,arr,path):
    global x
    global count
    
    if(i==len(arr)):
        if(x//2==sum(path)):
            print(path)
            count+=1
        return
    generate_all_subsets(i+1,arr,path+[arr[i]])
    generate_all_subsets(i+1,arr,path)
generate_all_subsets(0,arr,[])

if(count>=2 and sum(arr)%2==0):
    print(True)
else:
    print(False)