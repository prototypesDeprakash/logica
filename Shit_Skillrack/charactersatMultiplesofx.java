package Shit_Skillrack;

import java.util.ArrayList;

public class charactersatMultiplesofx {

    private static void sol1(String s , int n){
       
        ArrayList<Character>res = new ArrayList<>(); 
        for(int i=1;i<=26;i++){
            if(i%n==0){
                res.add((char) ('a' + i - 1));
            }
        }
        String finalres ="";
        for(char ch : s.toCharArray()){
            if(res.contains(ch)){
                finalres +=ch;
            }
        }
        
        System.out.println(finalres);
    }
    public static void main(String[] args) {
        sol1("abcdefghijklmno", 5);
    }
}
