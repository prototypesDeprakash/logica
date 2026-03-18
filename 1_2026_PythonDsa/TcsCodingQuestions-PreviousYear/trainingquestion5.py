'''
Question 5: Perfect Donation Amount
Problem: Check if a donation amount is a perfect number 
(sum of its proper divisors equals the number). Return true 
if perfect, false otherwise.'''

donation = int(input())

res=0
for i in range(1,donation):
    if(donation%i==0):
        res+=i
if(res==donation):
    print("true")
else:
    print("false")
