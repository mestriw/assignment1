package tasks;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(num + "! = " + factorial(num));

    }

    public static int factorial(int num) {
        // factorial 1 is 1
        if(num == 1) {
            return 1;
        }
        else{
            // multiply our number by recursion, decreasing by one each time
            return(num * factorial(num-1));
            }

    }
}
