package Dailysum.DigitalBasics;

public class lastDigitOfaNumber {



    private static void sol1(int nums){
        String a= "38";

        int max=0;

        for(int i=0;i<a.length();i++){
            max=Math.max(max, Integer.parseInt(String.valueOf(a.charAt(i))));
        }
        
        System.out.println(max);
        String b="175";

        int y=0;
        if(b.length()>2){
             y=Integer.parseInt(b.substring(b.length()-2, b.length()));
        }
        else{
            y=Integer.parseInt(b);
        }
        System.out.println((y%10)%4);

        double res = Math.pow(max, (y%10)%4);
       System.out.println((int)res);

    }
    public static void main(String[] args) {
        sol1(0);
    }
}