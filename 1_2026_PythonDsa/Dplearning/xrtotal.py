def find_xor_total(arr):
  """
  Calculates the XOR total of an array using a loop.
  """
  xor_sum = 0
  for num in arr:
    xor_sum ^= num # Use the bitwise XOR operator '^'
  return xor_sum


res=0

def calculatesubset(i,arr,s):
  global res

  if(i==len(arr)):
    res+=find_xor_total(s)
    return
  
  calculatesubset(i+1,arr,s+[arr[i]])
  calculatesubset(i+1,arr,s)
nums = [1,3]
calculatesubset(0,nums,[])
print(res)
  
  