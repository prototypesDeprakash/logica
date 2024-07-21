'''a=[0,1,2,3,4]
k=6
p=0
while(k!=0):
    if(k>0 and p<len(a)):
        
        p+=1
        k-=1
    if(p==len(a) and k!=0):
        print(p)
        p-=1
        k-=1
    
#print(a[p])
    '''
n = 5 
k = 6  
p = 0  
direction = 'R'

for i in range(k):
    if(direction=='R'):
        p+=1
        if(p==n-1):
            direction='L'
    if(direction=='L'):
        p-=1
        if(p==0):
            direction='R'
print(p)

