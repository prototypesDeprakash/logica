package Dailysum.jan25;

import java.util.ArrayList;

public class asciiprogram {

    public static String toBinaryString(int number) {
        return String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
    }
    private static void sol1(String s1 , String s2){
        ArrayList<String> askivalue = new ArrayList<>();
        for(char ch: s2.toCharArray()){
            askivalue.add(toBinaryString((int)ch));

        }
        System.out.println(askivalue);

        ArrayList<String> finres = new ArrayList<>();
        
        for(int i=0;i<5;i++){
            String current ="";
            for(int j=0;j<8;j++){
                if(askivalue.get(i).charAt(j)=='0' ){
                    current+=s1.charAt(j);
                }else{
                    current+=s1.toUpperCase().charAt(j);
                }
            }   
            finres.add(current);

        }
        System.out.println(finres);
    }
    public static void main(String[] args) {
        sol1("universe", "Hello");
        
    }
}
