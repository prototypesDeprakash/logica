package neetcodeBAsics;

public class Besttimetobuyandselltocks {

    private static int sol1(int[]arr){
        int sol=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               
                    if(arr[i]<arr[j]){
                        sol=Math.max(sol, arr[j]-arr[i]);
                    }
                
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        sol1(prices);
    }
}