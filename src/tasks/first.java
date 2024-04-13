package tasks;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int x = sc.nextInt(); // input
        int[] numbers = new int[x]; // creating the array
        System.out.println("Enter the numbers of arrays: ");
        for (int i = 0; i < x; i++) { // filling the array
            numbers[i] = sc.nextInt();
        }
        System.out.println("The minimum of this array: " + minimum(numbers, x)); // output
    }
    public static int minimum(int[] numbers, int x)
        {
            if(x == 1)
                //if input will be 1, the function returns 1 element which index is zero
                return numbers[0];
            else
                // using math.min for finding the minimum between array and recursion
                return Math.min(numbers[x-1], minimum(numbers, x-1));
        }

}
