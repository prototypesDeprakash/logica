'''
A school is trying to take an annual photo of all the students.
 The students are asked to stand in a single file line in non-decreasing
   order by height. Let this ordering be represented by the integer array 
   expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that 
the students are standing in. Each heights[i] is the height of the ith student 
in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.'''
heights = [1,1,4,2,1,3]

c=0
h2=heights.copy()
h2.sort()
print(h2)
print(heights)
c=0
for i in range(len(h2)):
    print(h2[i],heights[i])
    if(h2[i]!=heights[i]):
        c+=1
print(c)
