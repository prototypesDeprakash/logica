package Dailysum;

import java.util.ArrayList;

public class nov4 {


    private static void solution1(char[]chars){
       
        int c=1;
        String res="";
       
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;
                
            }
            else{
                res+=chars[i-1];
                res+=c;
                c=1;

            }
           
        }
        res+=chars[chars.length-1];
        res+=c;
        char[] finres=res.toCharArray();
        for(int i=0;i<res.length();i++){
            chars[i]= finres[i];
           
        }
       
        System.out.println(res.length());
       
       
    }


    private static void solution2(char[]chars){
       
        int c=1;
        String res="";
       if(chars.length<2){
        System.out.println(1);
       }
       else{
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;
                
            }
            else{
                if(c==1){
                res+=chars[i-1];
                c=1;
                }
                else{
                res+=chars[i-1];
                res+=c;
                c=1;
                }
               

            }
           
        }
        res+=chars[chars.length-1];
        res+=c;
        
        if(res.length()==chars.length){

            System.out.println(res.length());
        }else{
        char[] finres=res.toCharArray();
        for(int i=0;i<res.length();i++){
            chars[i]= finres[i];
            System.out.println(chars[i]);
           
        }
        }
       }
        System.out.println(res.length());
        
    }

    private static int solution3(char[]chars){

        //rules
        //if s=[a,b] then output is unchanged , no unzip , just return 1 
        //if s=[a,a,b,b] then the output is 4 because after compress s=[a,2,b,2] its length is 4
        //don't fucking return all , just return the lengthafter compressing
        //also we must modify the input array , with the characters in compress only when comprss is done

        int c=1;
        String res="";

//rule 1 done
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;   
            }
            else{
                if(c==1){
                res+=chars[i-1];
                
                }
                else{
                res+=chars[i-1];
                res+=c;
                c=1;
                }
            }
        }
        res+=chars[chars.length-1];
        if(c!=1){
            res+=c;
        }
    
    //now modify input array
        char[]finres=res.toCharArray();
    for(int i=0;i<res.length();i++){
        chars[i]=finres[i];
    }
        return res.length();

    }
    public static void main(String[] args) {
        char[] chars = {'a'};
        solution3(chars);



    }


}
