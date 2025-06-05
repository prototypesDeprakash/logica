package Skillrack;

import java.util.ArrayList;
import java.util.Collections;


public class oddeven {
   public static void main(String[] args) {
    int a  = 4; //odd 5,7,9,11
    int b = 14;  //even 10,8,6

    ArrayList odds = new ArrayList<>();
    ArrayList Evens = new ArrayList<>();
    int startwith;
    int endwith ;
    if(a<b){
        startwith=a;
        endwith=b;
    }
    else{
        startwith=b;
        endwith=a;
    }

    for(int i=startwith ;i<=endwith;i++){
        if(i%2!=0){
            odds.add(i);
        }
        else{
            Evens.add(i);
        }
    }
    
    System.out.println(odds);
    System.out.println(Evens);
    Collections.reverse(Evens);

    int arrlength=0;
    if(odds.size()>Evens.size()){
        arrlength=odds.size();
    }
    ArrayList finalans = new ArrayList<>();

    for (int i = 0; i < arrlength; i++) {
        if (i < odds.size()) {
            finalans.add(odds.get(i));
        }
        if (i < Evens.size()) {
            finalans.add(Evens.get(i));
        }
    }
System.out.println(finalans);
   }

}
