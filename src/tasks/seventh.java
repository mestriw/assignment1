import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length:  ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // creating array
        System.out.println("Enter your numbers: ");
        for (int i = 0; i < n; i++) {
            // filling
            arr[i] = scanner.nextInt();
        }

        System.out.println("Reverse:");
        reverse(arr, 0);

    }

    public static void reverse(int[] arr, int i) {
        if (i < arr.length) {
            // call recursion
            reverse(arr, i + 1);
            System.out.print(arr[i] + " ");
        }
    }
}