mylist = [1,2,3,4,5,6]
print (mylist)

mylist2 = [1,"fuck",3.5,True]
print (mylist2)
print(type(mylist2[3]))

# lists are ordered , changeable, and allow duplicate values.
print(mylist2[0])  # accessing first element

nested = [[1,2,3],[4,5,6],[7,8,9] ]
print(nested[0][2])  # accessing element 6 from nested list

del mylist[0]
print(mylist)
mylist[0]=999
print(mylist)


#tuples

mytuple = (1,[2,3],4.5,"hello" )
print(mytuple)