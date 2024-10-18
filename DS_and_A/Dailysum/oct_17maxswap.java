package Dailysum;

import java.util.ArrayList;


import java.util.Collections;

import javax.swing.text.html.HTMLEditorKit.Parser;
/**
 * oct_17maxswap
 */


public class oct_17maxswap {

    // private static String bruitforce(String num){
    //     return num.substring(1)+num.charAt(0);
    // }

    // public static void main(String[] args) {
    //     int num=2736;
    //     String s =Integer.toString(num);
    //     ArrayList<String> res= new ArrayList<>();
    //     for(int i=0;i<s.length();i++){
    //         res.add(bruitforce(s));
    //         s=bruitforce(s);
    //     }
    //     System.out.println( res);
    // }

private static int solution1(int num){
        //find the largest digit and swap it with the first digit

        //finding the largest digit 
    int numcopy=num;
        int maxnums=0;
        int temp;

        while (num!=0) {
            temp=num%10;
            maxnums=Math.max(maxnums, temp);
            num=num/10;

        }
        //System.out.println(maxnums);
        //max number found --- 
        char compare=Integer.toString(maxnums).charAt(0);
        char[] c = Integer.toString(numcopy).toCharArray();
        char tempc;
        //want to swap it with c[0] 
        for(int i=0;i<c.length;i++){
            if(c[i]==compare){
                // we should check c[0] if its alreeady = compare or greater than compart 
                //we should swap c[0+1]
                System.out.println("fl");
                for(int j=0;j<c.length;j++){
                System.out.println("sl");

                        if(c[j]<compare){
                System.out.println("sc");

                            tempc=c[j];
                            c[j]=compare;
                            c[j]=tempc;
                        }
                       
                        
                }
                
            }
        }
        String res ="";
        for(char i : c){
            res+=i;
        }
        return  Integer.parseInt(res);
}
 
private static void solution2(int num){
    int maxnum=0;
    int maxnuminde=0;
    int temp;
    char[] s = Integer.toString(num).toCharArray();
    while (num!=0) {
        temp=num%10;
        maxnum=Math.max(maxnum, temp);
        num/=10;
    } 
    for(char c : s){
        if(Character.getNumericValue(c)!=maxnum){
            maxnuminde++;
        }
    }

  //  char maxc =Integer.toString(maxnum).charAt(0);
    int parser=0;
    char tempc;
    for(int i=0;i<s.length;i++){    
        parser= Character.getNumericValue(s[i]); 
        if(parser<maxnum){
            tempc=s[i];
            parser=maxnum;
            s[maxnuminde]=tempc;
        }
    } 
    for(char c : s){
        System.out.print(c+" ");
    }

}

    public static void main(String[] args) {
        solution2(98368);
    }
    
}