package Dailysum;

import java.util.HashMap;
import java.util.HashSet;

/**
 * oct_3sumofarrdivnyk
 */

 
public class oct_3sumofarrdivnyk {
    //healper functions 
    //array sum fucntion
    private static int arrsum(int[]arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    //first solution
    private static void bruitforce(int[]arr,int k){
        HashSet<Integer>myHashSet = new HashSet<>();
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        
            for(int i=0;i<arr.length;i++){
                
                for(int j=i;j<arr.length;j++){
                    int sum=0;
                    int c=0;
                    for(int l=i;l<=j;l++){
                        sum+=arr[l];
                        c+=1;

                    }
                    myHashSet.add(sum);
                    myHashMap.put(sum, c);   
                }
            }
            System.out.println(myHashMap);
            

           // System.out.println(arrsum(arr));
            if(arrsum(arr)%k ==0){
                System.out.println("no changes");
            }
            else{
               // System.out.println("runs");
                for(int i: myHashSet){
                   // System.out.println(i);
                    if((arrsum(arr)-i )%k ==0 && arrsum(arr)!=i){
                        System.out.println("divisible when removed="+myHashMap.get(i)  );
                    }
                    
                }
            }
          //  System.out.println(myHashSet);
    }
    public static void main(String[] args) {
        int[]arr={1000000000,1000000000,1000000000};
        int k =3; //10%6=4
        bruitforce(arr, k);
        
    }
}
