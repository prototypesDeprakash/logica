package zoho_patterns;

public class programmingpattern {

    private static void sol1(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j){
                    System.out.print(s.charAt(j));
                }
                else if(j==s.length()-i-1){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        String s="programming";
        sol1(s);
    }
}
