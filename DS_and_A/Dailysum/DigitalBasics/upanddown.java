package Dailysum.DigitalBasics;

public class upanddown {

private static void sol1(String s){
    int base=0;
    int valey=0;
    for(char  c:s.toCharArray() ){
        if(c=='U'){
            base++;
        }else{
            base--;
        }
        if(base ==0 && c=='U'){
            valey++;
        }
    }
    System.out.println(valey);
}
    public static void main(String[] args) {
    String s = "DDUUUUDD";
    sol1(s);
    }
}
