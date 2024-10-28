package BasicPattern.twopoinandslidwinfow;

import java.util.HashMap;
import java.util.HashSet;


public class fruitintobasket {
 //solution1
    private static int bruitforcesolution1(int[]arr){
        int c=0;
        int maxc=c;
        for(int i=0;i<arr.length;i++){
        HashSet<Integer> myset = new HashSet<>();

            for(int j=i;j<arr.length;j++){
                myset.add(arr[j]);

                if   (myset.size()<=2) {
                    maxc=Math.max(maxc, j-i+1); //find 
                }
            }
            
            
            myset.clear();
        }
        return maxc;
    }

    //solution 2
    private static void slidingwindowsolution(int[]arr,int k){
        HashSet<Integer> myhashset = new HashSet<>();
            int l =0;
            int r=0;
            int maxsuize = 0;
            //count the key 
            HashMap<Integer,Integer> count = new HashMap<>();
            //number and its frequency          
        
            while (r<arr.length) {
                count.put(arr[r], count.getOrDefault(arr[r], 0) + 1); 
                if(count.size()>k){
                    while (count.size()>k) {
                        //count.get(arr[l]--);
                      count.put(arr[l], count.getOrDefault(arr[l], 0) -1);
                        if(count.get(arr[l])==0){
                            count.remove(arr[l]);
                        }
                        l++;
                    }

                }
                maxsuize=Math.max(maxsuize,r-l+1);
                r++;
            }
            
            System.out.println(maxsuize);

            
           
    }
    
    
    public static void main(String[] args) {
        int[] fruits ={3,3,3,1,2,1,1,2,3,3,4};
      // System.out.println(bruitforcesolution1(fruits));
       slidingwindowsolution(fruits, 2);
    }
}
