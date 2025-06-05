package Leetcode_Ds_from_scratch.Arraystraining_assessmentDay3;

import Shit_Skillrack.display;

public class removeDuplicatesFromSortedarray {

    private static void removeDup(int[]arr){
        
        int i=0;
        for(int j=0;j<arr.length;j++){
               if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
               } 
        }
        //[1,2,2,3,3,3,4]
        //i=1,j=1
        // i==j do nothing , j moves to 2
        //i==1;j==2; i!=j , so first move i forward i++, then assign what is in j   to i , arr[i]=arr[j];
        //[1,2,2,3,3,3,4]
            //i=2, j=2
            //do nothing
            //i=2;j=3
            //i=j  , i=3;
        //[1,2,3,3,3,3,4];
        //i=3;j=3 .. j goes upto 4
        //i=3; j=4;
        // i++; then i=j, [1,2,3,4,3,3,4];
        //j reached end so print upto i 
        
        for(int x=0;x<=i;x++){
            System.out.println(arr[x]);
        }
        
       
    }
    public static void main(String[] args) {
        int[]arr  = {1,2,2,3,5,6,7,7,8,8,8,9};
        removeDup(arr);
        
    }
}
