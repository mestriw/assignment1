package tasks;

import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (checker(num)) {
            System.out.println(num + " is prime!");
        } else {
            System.out.println(num + " is composite");
        }
    }
    // I use boolean to convey true or false
    // true - prime, false - composite
    public static boolean checker(int num){
            if (num <= 1) {
                // the number 1 is not prime, so the value is false
                return false;
            }
            for (int i = 2; i < num; i++) {
                // use a loop to cycle through all possible divisors
                if (num % i == 0)
                    // if it is divided without a remainder, then it is composite
                    return false;
                // otherwise it will be true
                return true;
            }
            return true;
        }
}