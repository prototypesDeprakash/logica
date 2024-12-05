package Dailysum.dailysolved.December;

public class dec3 {
    private static void sol1(String s, int[]spaces,StringBuffer res){
        int start=0;
        int arrpointer=0;
        for(int i=0;i<s.length();i++){
            if(arrpointer<spaces.length && i==spaces[arrpointer]){
            if(i==spaces[arrpointer]){
                if(arrpointer==0){
                    res.append(s.substring(0, spaces[arrpointer]));
                }
                else{
                    res.append(s.substring(spaces[arrpointer-1],spaces[arrpointer]));
                }

                
            res.append(" ");
            arrpointer++;
            }
        }
        }
        if (arrpointer == 0 || arrpointer <= spaces.length) {
            res.append(s.substring(spaces[spaces.length - 1]));
        }
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        String given = "LeetcodeHelpsMeLearn";
        StringBuffer res = new StringBuffer();
        int[]spaces = {8,13,15};
        sol1(given, spaces, res);
    }
}
