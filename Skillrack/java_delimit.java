package Skillrack;

import java.util.Scanner;

public class java_delimit {
   public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    int A = Integer.parseInt(sc.nextLine().split(" : ")[0].trim());
    int B = Integer.parseInt(sc.nextLine().split(" : ")[1].trim());
   double a = sc.nextDouble();
    System.out.println(A+B);

   }
    
}
