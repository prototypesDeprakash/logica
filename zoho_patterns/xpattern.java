package zoho_patterns;

public class xpattern {

    private static void sol1(String s){
        for(int i=0;i<s.length();i++){
            for(int j =0;j<s.length();j++){
                // i=0,j=0 la P 
                //i=1,j=1 la R
                //i=2 , j=2 la O
                if(i==j){
                    System.out.print(s.charAt(j));
                }
                else if(j==s.length()-i-1){
                    System.out.print(s.charAt(j));
                }else{
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        sol1("geeksforgeeks");
    }
}