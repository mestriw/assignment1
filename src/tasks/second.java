package tasks;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int x = sc.nextInt();
        int[] numbers = new int[x];
        System.out.println("Enter the numbers of arrays: ");
        for (int i = 0; i < x; i++) { // filling
            numbers[i] = sc.nextInt();
        }
        // divide the total from the recursion by the number of elements
        System.out.println("The average of this array: " + average(numbers, x)/x );

    }
    public static float average(int[] numbers, int x) {
        if (x == 1)
            // if input will be 1, the function returns 1 element which index is zero
            return numbers[0];
        else
            // calculate the total sum of all elements using recursion
            return (numbers[x-1] + average(numbers, x-1));
    }
}

