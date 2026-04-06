'''def permu(i, s , path):
    if(i==len(s)):
        print (path)
        return
    
    permu(i+1,s,path+s[i])
    permu(i+1,s,path)
permu(0,"ABC","")
'''

#The above is to generate suv sequence ,it generates subsets without changine the order


def correctpermu(s,path):
    if (len(s)==0):
        if('AB' not in path):
            print(path)
        return
    for i in range(len(s)):
        ch = s[i]
        rem= s[:i]+s[i+1:]
        correctpermu(rem , path+ch)
correctpermu("ABC", "")