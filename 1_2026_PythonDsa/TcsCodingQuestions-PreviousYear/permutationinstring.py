s1 = "ab"
s2 = "eidbaooo"


def sol1():
    count1=[0]*26
    count2=[0]*26

    #calculating s1 freq


    for c in s1:
        count1[ord(c)-97]+=1
    

    k=len(s1) # window size
    for i in range(0,len(s2)):
        count2[ord(s2[i])-97]+=1
        if(i>=k):
            count2[ord(s2[i-k])-97]-=1
        if(count1==count2):
            return True
print(sol1())

