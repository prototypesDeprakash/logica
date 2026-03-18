'''Question 6: Inventory Frequency Counter
Problem: Given a string of space-separated item names, 
count the frequency of each item. If the input contains 
digits, output “Invalid input.”'''

arr=input().split()
print(arr)

hashmap={}
for i in arr:
    hashmap[i]=hashmap.get(i,0)+1
print(hashmap)


