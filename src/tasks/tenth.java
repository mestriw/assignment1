package tasks;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("gsd: " + gcd(a,b));
    }

    public static int gcd(int a, int b) {
        // if b = 0, return a
        if (b==0){
            return a;
        }
        else {
            // The gcd function is called recursively to find the gcd of the remainder
            // until the remainder is zero.
            return gcd(b,a % b);
        }

    }
}
