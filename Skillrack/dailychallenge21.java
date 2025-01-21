package Skillrack;

import java.util.ArrayList;
import java.util.Scanner;

public class dailychallenge21 {

    private static void sol1(){
        ArrayList<String> myinp = new ArrayList<>();
        Scanner sc = new Scanner( System.in);
       
        while (true) {
            String s = sc.nextLine();
            if(s!=""){
                myinp.add(s);
            }
            else{
                break;
            }

            
        }
       System.out.println(myinp);
    }
    public static void main(String[] args) {
        sol1();
    }
}
