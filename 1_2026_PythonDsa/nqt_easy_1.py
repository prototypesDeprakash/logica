'''A chocolate factory is packing chocolates into the packets. 
The chocolate packets here represent an array  of N number of integer values. 
The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor
belt(array).'''

'''
N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O 
should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated
 by newline

Output:

4 5 1 9 5 0 0 0'''

#remove 0's to end
#simple method

# for i in arr:
#     if(i ==0):
#         zerosCount+=1
#     if(i!=0):
#         res.append(i)
# for i in range(0,zerosCount):
#     res.append(0)

# print(res)



# n=int(input())
# j=0
# L=[0 for i in range(n)]
# for i in range(n):
#     a=int(input())
#     if a!=0:
#         L[j]=a
#         j+=1
# for i in L:
#     print(i,end=" ")


# move zeros with slow and fastpointer

arr = [4,5,0,1,9,0,5,0]
slowpointer =0
for fastpointer in range (0,len(arr)):
    if(arr[fastpointer]!=0):
        temp = arr[slowpointer]
        arr[slowpointer]=arr[fastpointer]
        arr[fastpointer]=temp
        slowpointer+=1
print(arr)


# all iterations 
'''
sp=0
fp=0
arr[fp]=4 !=0 so
temp=4
swap na lum same dhan 

next iteration
sp=1
fp=1
same 

sp =3
fp=3
sp =0
fp =0
fp mattum ++ agidum

sp=3
fp=4
ipa fp vandhu 0 va illa na swap agum 
number befor 0 poidum 0 last la varum..

'''

i =0
for j in range(0,len(arr)):
    if(arr[j]!=0):
        arr[i],arr[j] = arr[j],arr[i]
        i+=1
       
