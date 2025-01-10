package Skillrack;

public class averagespeed {

    private static void sol1(String s){
        String[]ans = s.split(" ");
        String[]firstArr= ans[0].split("@");
        String[] secArr = ans[1].split("@");
        int d = Integer.parseInt(firstArr[0])+ Integer.parseInt(secArr[0]);
        int t = Integer.parseInt(firstArr[1])+ Integer.parseInt(secArr[1]);
        System.out.println(d);
        System.out.println(t);
        float aans = d/t;
        System.out.printf("%.2f kmph",aans);

    }
    public static void main(String[] args) {
        sol1("61@5 120@3");
    }
}