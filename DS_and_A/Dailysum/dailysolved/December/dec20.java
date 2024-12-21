package Dailysum.dailysolved.December;

import zoho_patterns.triangelpattern;

public class dec20 {
 

    private static int sol1(int[][]arr){
        int c =0;
        
        for(int i=0;i<arr.length;i++){
            for(int j =0 ; j<arr[0].length;j++){
                boolean isEqual = true;
                for(int k=0;k<arr[0].length;k++){
                    //System.out.println(arr[i][k]==arr[k][j]);
                    if(arr[i][k]!=arr[k][j]){

                        isEqual=false;
                        break;
                    }      
                }
                if (isEqual) {
                    c++;

                }
            }
        }
        return c;
      
    }

    private static void sol11(int[][]arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                boolean isEqual=true;
                for(int j2=0;j2<arr[0].length;j2++){
                    System.out.println("Comparing: arr[" + i + "][" + j2 + "] = " + arr[i][j2] +
                       " with arr[" + j2 + "][" + j + "] = " + arr[j2][j]);
                    if(arr[i][j2]!=arr[j2][j]){
                        isEqual=false;
                    }
                }
                if(isEqual){
                    res++;
                }
            }
            
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[][]arr2={ {3,2,1},{1,7,6},{2,7,7}};
        int[][] arr={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        sol1(arr2);
        sol11(arr);
    }
}