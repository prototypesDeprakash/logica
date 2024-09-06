package subsetAndSubsequence;

public class basicsubset {
    //remove a's from the given string 

    private static StringBuilder remove_a(char[]str,int pointer, StringBuilder a){
        if(pointer==str.length)return a;
        if(str[pointer]!='a'){
            a.append(str[pointer]);
           // pointer++;
        }
        return remove_a(str, pointer+1, a);

        


    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        String word = "aaaapleaeaea";

       System.out.println( remove_a(word.toCharArray(),0,a));
    }
}
