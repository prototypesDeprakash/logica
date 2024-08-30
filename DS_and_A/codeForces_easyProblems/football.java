

import java.util.Scanner;

public class football {
    private static int findsequence(int n , int[] arr){
        int k=0;
        int seqcount =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                k++;
                seqcount=Math.max(seqcount, k);
            }
            else{
                k=0;
            }
        }
        return seqcount;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inp = sc.nextLine();
    int[] intArray = new int[inp.length()];

    for (int i = 0; i < inp.length(); i++) {
        intArray[i] = Character.getNumericValue(inp.charAt(i));
    }

    if(findsequence(0, intArray)>=7 || findsequence(1, intArray)>=7){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }


 }   
}
