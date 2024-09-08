package leetcode_problems;

/**
 * sep_8_contest_numtobinary
 */
public class sep_8_contest_numtobinary {

    private static String converttobinary(int n){
        StringBuilder res=new StringBuilder();
        while (n!=0) {
            int temp = n%2;
            res.append(temp);
            n=n/2;
        }
        res.reverse();
        return res.toString();

    }
    public static void main(String[] args) {

        /*Input: date = "2080-02-29"

        Output: "100000100000-10-11101"
         */
        String date = "2080-02-29";
        String[] parts = date.split("-");
        
        // Extract year, month, and day
        String year = parts[0];
        String month = parts[1];
        String day = parts[2];
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        String resstr = converttobinary(y)+"-"+converttobinary(m)+"-"+converttobinary(d); 

        System.out.println(resstr);
    }
}