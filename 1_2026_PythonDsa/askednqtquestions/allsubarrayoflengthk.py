# # sliding window fixed length

# nums=[1,2,3,4,5]
# n=len(nums)
# k=3

# def xorsum(arr):
#     res=arr[0]
#     for i in range(1,len(arr)):
#         res^=arr[i]
#     return res
# #print(xorsum(nums))

# finres=0
# for i in range(0,n):
       
#         for j in range(i,n):
#                 if(len(nums[i:j+1])==k):
#                     res=(nums[i:j+1])
#                     #print(res)
#                     finres+=xorsum(res)

# print(finres)


nums = [4,5,7,8]
n = len(nums)
k = 2

def xorsum(arr):
    res = arr[0]
    for i in range(1, len(arr)):
        res ^= arr[i]
    return res

finres = 0

for i in range(n - k + 1):   # ✅ only valid starts
    res = nums[i:i+k]        # ✅ fixed-size slice
    finres += xorsum(res)

print(finres)