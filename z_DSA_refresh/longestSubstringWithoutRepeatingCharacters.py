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