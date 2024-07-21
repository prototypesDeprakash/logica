import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * test
 */
public class test {
        public static void main(String[] args) {
        int a=0;
        int b=1;
       int  n=15;
       int c=0;
       
       for (int i=0;i<n;i++){
        
        System.out.println(c);
        c=a+b;
        a=b;
        b=c;
       }

    ArrayList<Integer> myarr = new ArrayList<>(); // Corrected initialization
    Integer[] elements = {1, 2, 3, 4, 5};
    Collections.addAll(myarr, elements);
    System.out.println(myarr);



    }
}