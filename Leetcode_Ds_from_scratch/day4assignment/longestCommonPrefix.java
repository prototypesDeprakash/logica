package Leetcode_Ds_from_scratch.day4assignment;

public class longestCommonPrefix {
    private static String sol1(String[]arr){
        
        for(int i=0;i<arr[0].length();i++){
            char ch = arr[0].charAt(i);
           for(int j=1;j<arr.length;j++){
            
            if(i>=arr[j].length() || arr[j].charAt(i)!=ch){ //j is for taking each string ...
                return arr[0].substring(0,i);  // i only checks if prev is > cur and !=cur
            }
           }
        }
        return arr[0];
    }
    public static void main(String[] args) {
        String[]arr={"flower","flow","flight"};
        System.out.println(sol1(arr));
    }
}
