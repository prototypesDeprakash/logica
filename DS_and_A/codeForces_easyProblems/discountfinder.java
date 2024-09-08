//package codeForces_easyProblems;

import java.util.Scanner;

public class discountfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int per =sc.nextInt();
        int pri = sc.nextInt();
        double res = pri / (1 - (per / 100.0));

        System.out.printf("%.2f\n", res);
    }
}
