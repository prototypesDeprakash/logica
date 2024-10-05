package Dailysum;

import java.util.HashMap;
import java.util.HashSet;

public class oct_1checkifarrpairsarediv {
    private static void hintans(int[]arr){
        HashSet<Integer> myhashset = new HashSet<>();
        int k = 5;
       for(int x : arr){
        int res =  ((x%k)+k )%k;
            myhashset.add(res);
       }
       
  
       System.out.println(myhashset);
       if(myhashset==null){
        System.out.println("true");
       }
       else{
        System.out.println("False");
       }

    }


    private static boolean modulo_method(int[]arr,int k){
        //step 1 store modulus of each element

        HashMap<Integer,Integer> mymap = new HashMap<>();
        for (int num : arr) {
            int mod = num % k;
            if(mod<0)mod+=k;
            mymap.put(mod, mymap.getOrDefault(mod, 0) + 1);
        }

        //if the number of zeros is even then it get pairs
        //number of element with modulus 4 and 1 should be equal in count so they form a pair
        //||| 2 and 3 must be equal in count

        if (mymap.getOrDefault(0, 0) % 2 != 0) return false;
        System.out.println(mymap);
       for(int i=1;i<k;i++){
          if( mymap.get(i)!=mymap.get(k-i) ){
            return false;
          }
          
       }
       return true;
    }
    //arr = [1,2,3,4,5,10,6,7,8,9]
    //k = 5
   //formula  =  ((arr[i]%k)+k )%k

   
    public static void main(String[] args) {

        int[ ]arr = {6,6,1,2,6,7,6};
      System.out.println(  modulo_method(arr, 10));
        
        
       
    }

}
