package Dailysum.jan25;

public class CheckIfParenthesiscanbeValid {

    private static void sol1(String s , String locked){
        String fin = "";
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                fin+="x";
            }else{
                fin+=s.charAt(i);
            }
        }
        System.out.println(fin);
        int xcount=0;
        int lpcount = 0;
        int rpcount=0;
        for(char ch:fin.toCharArray()){
            if(ch =='x'){
                xcount++;
            }
            else if(ch==')'){
                rpcount++;
            }
            else{
                lpcount++;
            }
        }

        int totalpcount = Math.abs(lpcount-rpcount);
        if(totalpcount==0 && xcount%2==0){
            System.out.println("true");
        }
       
        



    }
    public static void main(String[] args) {

      String  s = "())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(";
      String locked ="100011110110011011010111100111011101111110000101001101001111";
        sol1(s, locked);
    }
}