package tasks;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fibon(n));
    }

    public static int fibon(int n) {
        // if the number is 1, then return the same number
        if(n <= 1){
            return n;
        }
        else{
            // using recursion we implement our formula
            return(fibon(n-1) + fibon(n-2));
        }
    }
}
