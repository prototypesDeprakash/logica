package Dailysum;

public class nov4b {
    private static void solution1(String word){
        char[] chars = word.toCharArray();
        int c=1;
        String res="";
       
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1] &&c<9){
                c++;
                
            }
            else{
                res+=c;
                res+=chars[i-1];
                c=1;

            }
           
        }
        res+=c;

        res+=chars[chars.length-1];
        System.out.println(res);
    }
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        solution1(word);
    }
}
