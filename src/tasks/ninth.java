package tasks;

import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println("Enter the number k: ");
        int k = sc.nextInt();
        System.out.println("Binomial coefficient is equal to " + binom(n,k));
    }

    public static int binom(int n, int k) {
        // if k == 0 or n, coefficient is equal to 1
        if (k == 0 || k == n){
            return 1;
        }
        else {
            // using the formula of binomial coefficient
            return (binom(n-1,k-1) + binom(n-1, k));
        }

    }
}
