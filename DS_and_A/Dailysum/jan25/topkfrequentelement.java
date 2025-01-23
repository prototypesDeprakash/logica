package Dailysum.jan25;

import java.util.ArrayList;
import java.util.HashMap;


public class topkfrequentelement {
    //nums = [1,1,1,2,2,3], k = 2


    private static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int[] sort(int[]valarr , int[]keyarr ){
        for(int i=0; i < valarr.length; i++){    
            for(int j=1; j < (valarr.length-i); j++){    
                     if(valarr[j-1] < valarr[j]){    
                            //swap elements    
                            int temp = valarr[j-1];   
                            int temp2 = keyarr[j-1];

                            valarr[j-1] = valarr[j];  
                            keyarr[j-1]=keyarr[j]  ;
                            valarr[j] = temp;    
                            keyarr[j]=temp2;
                    }          
        }    
    } 
    return keyarr;  
    }
    private static int[] sol1(int[]arr , int k){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mymap.put(arr[i], mymap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(mymap);

        ArrayList<Integer> keypart  = new ArrayList<>(mymap.keySet());
         ArrayList <Integer> valuespart = new ArrayList<>(mymap.values());
         int[] valarr = new int[keypart.size()];
         for(int i=0;i<valarr.length;i++){
            valarr[i]=valuespart.get(i);
         }
         int[]keyarr = new int[keypart.size()];
         for(int i=0;i<keyarr.length;i++){
            keyarr[i]=keypart.get(i);
         }


         System.out.println(keypart);
        System.out.println(valuespart);
        int[]finkeyarr=sort(valarr, keyarr);
       int finalres[]= new int[k];
        for(int i=0;i<k;i++){
            finalres[i]=finkeyarr[i];
            //System.out.println();
        }
       
       return finalres;
    }
    public static void main(String[] args) {
        int[]ans = {4,1,-1,2,-1,2,3};
        display(sol1(ans, 2));
       // int test[]={2, 1, 2, 1, 1};
        

        
    }
}
