#subarray
arr=list(map(int, input().strip().split()))


sum_of_array=sum(arr)//2
if(sum_of_array%2!=0):
  print("False")
  exit()
res=[]
def subarray(i,path):
  if(i ==len(arr)):
    if(sum(path) == sum_of_array):
      res.append(path)
    return
  subarray(i+1,path+[arr[i]])
  subarray(i+1,path)
subarray(0,[])

print(res)
  
  
# input: 2 4 6 8
arr = list(map(int, input().strip().split()))

total_sum = sum(arr)

# 1. Check if the total sum can be halved
if total_sum % 2 != 0:
    print("False")
    exit()

target = total_sum // 2
res = []

def find_subsets(i, current_path, current_sum):
    # Base case: if we reached the target sum
    if current_sum == target:
        res.append(current_path)
        return 
    
    # Base case: if we reached the end or exceeded target
    if i == len(arr) or current_sum > target:
        return

    # Option 1: Include the current element
    find_subsets(i + 1, current_path + [arr[i]], current_sum + arr[i])
    
    # Option 2: Exclude the current element
    find_subsets(i + 1, current_path, current_sum)

find_subsets(0, [], 0)

# The question asks for True/False if such a division exists
if len(res) > 0:
    print("True")
    # Optional: print(f"Subsets found: {res}")
else:
    print("False")