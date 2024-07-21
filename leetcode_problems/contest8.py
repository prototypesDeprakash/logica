class Solution:
    def validStrings(self, n: int) -> List[str]:
        if(n==1):
            return ["0","1"]

        default =["0","1"]

        for i in range(1,n):
            new_res=[]
            for s in default:

                new_res.append(s + '1')
                # Add '0' only if the last character is '1'
                if s[-1] == '1':
                    new_res.append(s + '0')
            default = new_res
        return new_res
# increase sloops knowledge

class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        res=""
        for i in range(len(s)):
            pos=(i+k)%len(s)
            res+=s[pos]
            
          
                
        return res
#modular arithmetic knowedge
