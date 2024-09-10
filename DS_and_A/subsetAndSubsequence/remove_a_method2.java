package subsetAndSubsequence;

/**
 * remove_a_method2
 */
public class remove_a_method2 {

    private static void skip(String result , String remaining){
        if(remaining.isEmpty()){
            System.out.println(result);
            return;
        }

        char current = remaining.charAt(0);
        if(current=='a'){
            skip(result, remaining.substring(1)); // skipping 1 character
        }
        else{
            skip(result+current, remaining.substring(1)); //if not a then add it to result
        }
    }
    public static void main(String[] args) {
        skip("", "hahahaloa");
    }
}