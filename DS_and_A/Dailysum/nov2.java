package Dailysum;

public class nov2 {
    //circular String
    private static boolean solution1(String s){
        String[] fin=s.split(" ");
        //even's end = odd's start
        //0 end = 1 start
        //1 end = 2 start
        for(int i=0;i<fin.length-1;i++){
           if(fin[i].charAt(fin[i].length()-1) != fin[i+1].charAt(0)){
            return false;
           }
           if(fin[0].charAt(0)!=fin[fin.length-1].charAt(fin[fin.length-1].length()-1)){
            return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="Leetcode";
        System.out.println(solution1(s));
        String[] fin=s.split(" ");
        System.out.println();
        
    }
}
