package tasks;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println(a + "**" + n + " = "+ power(a,n));
    }

    public static int power(int a, int n) {
        // any number raised to the 1st power is equal to itself
        if(n == 1){
            return(a);
        }
        else{
            // I multiply the number by recursion, reducing the number n
            // so that it is multiplied as many times as necessary
            return(a * power(a, n-1));
        }

    }
}
