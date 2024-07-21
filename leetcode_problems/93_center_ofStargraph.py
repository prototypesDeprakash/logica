a=[[1,2],[5,1],[1,3],[1,4]]

#linear time complexity 
'''x=set()
for i in range(0,2):
   # print(a[i][i],end="-ivalue-")
    for j in range(len(a[0])):
        if(a[i][j] not in x):
            x.add(a[i][j])
        else:
            print(a[i][j],"-center found")
            exit()
        #print(a[i][j],end=" ")
    '''
#constant time complexity 
y=a[2]

x=list(a[1])

print(x)
print(y)
if(x[0] in y ):
    print(x[0])
else:
    print(x[1])

    
#java solution
'''
class Solution {
    public int findCenter(int[][] edges) {
      ArrayList<Integer> x=new ArrayList<>();
      ArrayList<Integer> y = new ArrayList<>();
      for(int i=0;i<1;i++){
        for(int j=0;j<edges[0].length;j++){
            x.add(edges[i][j]);
        }
      }//end of loop 1

      for(int i=1;i<2;i++){
        for(int j=0;j<edges[0].length;j++){
            y.add(edges[i][j]);
        }
      }
        
        int a = x.get(0);
        int b = x.get(1);
        if(y.contains(a)){
            return a;
        }
        else{
            return b;
        }
    }
}
'''