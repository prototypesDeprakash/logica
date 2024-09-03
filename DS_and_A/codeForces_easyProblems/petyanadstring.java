
import java.util.Scanner;

public class petyanadstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        int compareres=  s1.compareTo(s2);

        if(compareres<0){
            System.out.println("-1");
        
    } else if (compareres > 0) {
        System.out.println("1");
    } else {
        System.out.println("0");
    }

    }
}
