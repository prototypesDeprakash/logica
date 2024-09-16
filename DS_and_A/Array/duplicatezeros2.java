package Array;

import java.util.ArrayList;

public class duplicatezeros2 {
    //solution
    private static ArrayList dupzeros1(int[] arr){
        ArrayList <Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
            if(arr[i]==0){
                a.add(0);
                
            }
        }
        return a;        
    }  
    private static int countzero(int []arr) {
        int c=0;
        for(int i: arr){
            if (i==0){
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        /*Input: arr = [1,0,2,3,0,4,5,0]
        Output: [1,0,0,2,3,0,0,4] */
        int[]arr = {1,0,2,3,0,4,5,0};

        //unpotimal
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(dupzeros1(arr).get(i));
        // }
        int i =arr.length-1;
        int j =  arr.length+countzero(arr)-1;
        while (i>=0) {
            if(j<arr.length){
                arr[j]=arr[i];
            }
            if(arr[i]==0){
                j--;
                if(j<arr.length ){
                    arr[j]=0;
                }
            }
            i--;
            j--;
            
     
        }
        System.out.println(arr.length);
      for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]);
      }

    }
}
