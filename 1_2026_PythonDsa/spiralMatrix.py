matrix  =[[1,2,3],
          [4,5,6],
          [7,8,9]]


# top =0
# bottom = len(matrix)-1
# left =0
# right = len(matrix[0])-1

# '''

# l->r 
# t->b
# r->l
# b->t

# '''
# # core idea

# while True:
#     if(left>right or top> bottom):
#         break


#     for  i in range(left,right+1):
#         print(matrix[top][i] , end =" ")
#     top+=1
#     for i in range(top,bottom+1):
#         print(matrix[i][right] , end =" ")
#     right-=1
#     for i in range(right,left-1,-1):
#         print(matrix[bottom][i],end=" ")
#     bottom-=1
#     for i in range(bottom,top-1,-1):
#         print(matrix[i][left],end=" ")
#     left+=1

# correct logic

class Solution:
    def spiralOrder(matrix: list[list[int]]) -> list[int]:

        top =0
        bottom = len(matrix)-1
        left=0
        right = len(matrix[0])-1

        '''
        flow 
        left -> right 
        top -> bottom
        right ->left
        bottom -> top

        '''
        res=[]
        while left<=right and top<=bottom:
            
            for i in range(left,right+1):
                res.append(matrix[top][i])
            top+=1
            for i in range(top,bottom+1):
                res.append(matrix[i][right])
            right-=1
            #reverse
            if top<=bottom:
                for i in range(right,left-1,-1):
                    res.append(matrix[bottom][i])
                bottom-=1
            if left<=right:
                for i in range(bottom , top-1,-1):
                    res.append(matrix[i][left])
                left+=1
        return res
print(Solution.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))