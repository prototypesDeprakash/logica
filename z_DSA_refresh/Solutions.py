'''1.Two Sum: Given an array of integers and a target value, return the indices of two elements 
whose sum equals the target. You cannot use the same element twice.'''

arr=[1,2,3,4,5,6,7,8]
target=9

def sol():
    for i in range(0,len(arr)): #(loops runs from 0 to len(arr)-1)
        for j in range(i+1,len(arr)): #(i+1 because we dont want i == j )
            if(arr[i]+arr[j]==target): 
                #checks if arr[i]+arr[j] == target , if yes then return its index
                return [i,j]
print(sol())


def optimal():
    hashmap ={}

    for i in range(0,len(arr)):
        complement  = target-arr[i] # what should i add with arr[i] to get target , ex 3+ ? => 9
        if(complement in hashmap): #if the number i need is already present in the hashmap 
            return[hashmap[complement],i] #return the value of the complement(index) and current index
        
        hashmap[arr[i]]=i # every iteration add the number as key and its index as value
print(optimal())

'''2.Valid Parentheses: Given a string containing ()[]{}, 
determine whether the brackets are correctly matched and nested'''
s = "([]){[]}"

def isValidParenthesis():
    stack=[]
    for x in s:
        if(x=='('  or x=='{' or x=='['): #the parenthesis should start with ( || { || [
            stack.append(x)
        else:
            if(len(stack)==0): 
                return False
            if(x==')' and stack[-1]!='('): # checking if the last element is the correct pair 
                return False
            if(x=='}' and stack[-1]!='{'):
                return False
            if (x==']' and stack[-1]!='['):
                return False
            stack.pop() # if the above conditions fail then it must be correct pair , so pop()
    return len(stack)==0 # if the final stack is empty then we poped all the valid pairs so it returns true/false
print(isValidParenthesis())

'''3.Valid Palindrome: Check whether a string reads the same forward and backward,
 ignoring case, spaces, and punctuation.'''
s="rac  eca .,r"
#ignoring spaces , punctutations and cases
cleaned = ""

for x in s:
    if x.isalnum(): #only consider alphabets , ignore spaces and punctutations
        cleaned += x.lower()


s=cleaned

def isValidParenthesis():
    if(s==s[::-1]):
        return True
    else:
        return False


def isValidParenthesis2():
    i=0;
    while(i<len(s)//2): # only need to compare first half with the second half so len(s)//2
        if(s[i]!=s[len(s)-1-i]):
            return False
        i+=1
    return True

print(isValidParenthesis2())

'''Merge Two Sorted Arrays: Combine two arrays already sorted in ascending order
 into one sorted array, keeping any duplicate values.'''
arr1 = [1, 3, 5, 5,7]
arr2 = [2, 3, 4, 8]

def merge():
    mergedArray = arr1+arr2
    mergedArray.sort()
    return mergedArray

def mergeSortedArray():
    result =[]
    i=0
    j=0
    while(i<len(arr1) and j<len(arr2)):
        # sorting the elements by ascending order 
        if(arr1[i]<arr2[j]):
            result.append(arr1[i]) # if arr1's ith element is smaller then add it first
            i+=1 #increment the i pointer
        else:
            result.append(arr2[j])  # if arr2's ith element is smaller then add it first
            j+=1 #increment the j pointer
        # adding the remaining elements
        while i<len(arr1):
            result.append(arr1[i]) # since the original array is sorted it will add the remaining
                                   # element in correct order
            i+=1
        while j<len(arr2):
            result.append(arr2[j])
            j+=1
    return result
print(mergeSortedArray())

'''Longest Substring Without Repeating Characters: Given a string, return the length 
of the longest continuous substring containing no repeated characters.'''

s="abccadbbad"
max_len=0

def solution():
    for i in range(0,len(s)): #start with i
        temp=set() # temp=""
        for j in range(i,len(s)):
            if(s[j] not in temp): #j=0 , temp ="a" , j=1 temp ="ab" , j=3 temp="abc", j=4 temp=abcc ,break
                temp.add(s[j])
                max_len=max(max_len,len(temp)) # in every iteretion the max value is also calculated
            else:
                break
    return(max_len)