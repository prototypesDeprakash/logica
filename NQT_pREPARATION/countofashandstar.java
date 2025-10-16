package NQT_pREPARATION;

public class countofashandstar {

    private static int counter(String s ){
        int star=0;
        int ash=0;
        for (char i: s.toCharArray() ) {
            if(i=='*'){
                star++;
            }else if(i=='#'){
                ash++;
            }
        }
        return star-ash;
        
    }
    public static void main(String[] args) {
        String s = "*#";
        
        if(counter(s)>0){
            System.out.println("positive integer");
        }else if (counter(s)<0){
            System.out.println("Negative integer");
        }else if (counter(s)==0){
            System.out.println("Both numbers are equal");
        }
    }
}
