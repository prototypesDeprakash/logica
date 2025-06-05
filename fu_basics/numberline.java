package fu_basics;

import Skillrack.display;

public class numberline {

    private static int[] sol1(int n){
        int[]arr=new int[n];
        int half = n/2;
        int k=0;
       for(int i=1;i<=half;i++){
        arr[k++]=i*-1;
       }
       for(int j=1;j<=half;j++){
        arr[k++]=j;
       }
     
       return arr;

    }
    public static void main(String[] args) {
       sol1(5);
       
    }
}