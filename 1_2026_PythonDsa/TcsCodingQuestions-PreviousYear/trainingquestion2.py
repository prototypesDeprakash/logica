'''
Question 2: Problem Statement:
You are given a range of integers from M to N (inclusive), where:

M is the lower limit
N is the upper limit
Your task is to find all palindrome numbers in the range and return the count of such numbers.

Input Format:

Enter M : <lower limit integer> Enter N : <upper limit integer> 

Output Format:

<number of palindrome numbers> 

Definition:
A palindrome number is a number that reads the same backward as forward.
Example: 121, 131, 11, 9

Example Input:

Enter M : 10 Enter N : 20 

Example Output:

1 

Explanation:
Only one palindrome exists between 10 and 20 → 11'''


N = int(input())
M= int(input())

count=0
for i in range(N , M+1):
    if(str(i)==str(i)[::-1]):
        count+=1
print(count)
