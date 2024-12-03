package Dailysum.dailysolved.December;

public class dec2 {
    private static int sol1(String[]arr, String s){
        int c =1;
        for (String i : arr) {
            if(i.startsWith(s)){
                return c;
            }
            c++;
        }
        return -1;
    }

    public static void main(String[] args) {
         String str= "hellohello hellohellohello";
         String[]arr=str.split(" ");
         String s="ell";
         System.out.println(sol1(arr, s));
    }
}