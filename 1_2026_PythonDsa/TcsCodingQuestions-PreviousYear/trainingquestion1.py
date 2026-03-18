'''
Problem Statement:
You have to design a weekly exercise summary by taking the number of minutes of 
daily exercise for 7 consecutive days.
The exercise duration for all days will be entered by the user.

Your task is to:

Calculate the total exercise duration for the week
Calculate the average daily workout duration (rounded to nearest integer)
Input Format:

Day 1 exercise duration: <minutes> Day 2 exercise duration: <minutes> ... Day 7 
exercise duration: <minutes> 

Output Format:

Exercise summary Total exercise duration : <total> (minutes) Average daily 
exercise duration: <average> minutes 

Example Input:

Day 1 exercise duration: 45 Day 2 exercise duration: 15 Day 3 exercise 
duration: 30 Day 4 exercise duration: 15 Day 5 exercise duration: 5 Day 6 exercise 
duration: 10 Day 7 exercise duration: 20 

Example Output:

Exercise summary Total exercise duration : 140 (minutes) Average daily exercise 
duration: 20 minutes'''

arr=list(map(int, input().split()))
print(sum(arr))
print(sum(arr)/len(arr))