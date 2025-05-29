package Leetcode_Ds_from_scratch.tire1_recursion;

public class sumOfElementsInArray {

    private static int ArraySum(int[]arr , int sum , int size){
        if(size==0)return sum;
        return ArraySum(arr, sum+arr[size-1], size-1);
    }

    private static void printNumberInArray(int[]arr , int start){
        if(start==arr.length)return;
        System.out.println(arr[start]);
        printNumberInArray(arr, start+1);

    }
    private static void ReversePrint(int[]arr , int start){
        if(start==0) return;
        System.out.println(arr[start-1]);
        ReversePrint(arr, start-1);
    }
    private static void characterOfString(String s , int size){
        if(size==s.length())return;
        System.out.println(s.charAt(size));
        characterOfString(s, size+1);
    }
    private static void reverseOrderString(String s , int size){
        if(size==0)return;
        System.out.println(s.charAt(size-1));
        reverseOrderString(s, size-1);
    }

    private static int howManyTimes(String s , int n, char c ,int sum ){
        if(n==s.length())return sum;
        if(s.charAt(n)==c) sum+=1;
       return howManyTimes(s, n+1, c, sum);
    }
    private static int howManyTimeswithoutvar(String s , int n , char c ){
        if(n==s.length())return 0;
        if(s.charAt(n)==c){
            int sum=1;
            return sum+howManyTimeswithoutvar(s, n+1, c);
        }else{
            int sum=0;
            return sum+howManyTimeswithoutvar(s, n+1, c);
        }
        
    }
    public static void main(String[] args) {

        int[]arr={1,2,3,4,5,6,7,8,9,10};
      //  System.out.println(ArraySum(arr, 0, 10));
      //  printNumberInArray(arr, 0);
       // ReversePrint(arr, 10);
    

        String s = "WORKATTECH";
      // System.out.println( howManyTimes(s, 0, 'T', 0));
      //  characterOfString(s, 0);

       // reverseOrderString(s, s.length());
       System.out.println(howManyTimeswithoutvar(s, 0, 'T'));

    }
}
