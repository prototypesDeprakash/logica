package Skillrack;

public class averagespeed {

    private static void display(String[]s){
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    private static void sol1(String s){
        String[]ans = s.replace(" ","@").split("@");
        display(ans);
        
        int f=0;
        int ss=0;

        for(int i=0;i<ans.length;i++){
        if(i%2==0){
            f+=Integer.parseInt(ans[i]);
        }else{
            ss+=Integer.parseInt(ans[i]);
        }

        }
        double anss= f/ss;
        System.out.printf("%.2f kmph",anss);

        
       


      
        // String[]firstArr= ans[0].split("@");
        // String[] secArr = ans[1].split("@");
        // int d = Integer.parseInt(firstArr[0])+ Integer.parseInt(secArr[0]);
        // int t = Integer.parseInt(firstArr[1])+ Integer.parseInt(secArr[1]);
        // System.out.println(d);
        // System.out.println(t);
        // float aans = d/t;
        // System.out.printf("%.2f kmph",aans);

    }
    public static void main(String[] args) {
        sol1("60@2 120@3");
    }
}