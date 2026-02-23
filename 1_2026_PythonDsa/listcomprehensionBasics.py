nums=[1,2,3,4,5]

# for i in range(0,len(nums)):
#     nums[i]=nums[i]**2
# print(nums)
print([i-10 for i in nums])
print([i*i for i in nums])


# convert strings to uppercse
words = ["game", "code", "build"]
print([i.upper() for i in words])

# extract even number

nums = [1,2,3,4,5,6]
print([i for i in nums if i%2==0])


#replace negative with 0
nums = [-1,2,-3,4]
print([max(i,0) for i in nums ] )

#medium problems
#flatten a matrix

matrix = [[1,2],[3,4]]
print([i for x in matrix for i in x])

#transposematrix
matrix = [[1,2,3],
          [4,5,6]]
r=len(matrix)
col=len(matrix[0])
t=[[0]*r for i in range(col)]
for i in range(r):
    for j in range(col):
        t[j][i]=matrix[i][j]
print(t)

#oneliner how
