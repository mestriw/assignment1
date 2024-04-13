import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumSquare(n));
    }
    public static int SumSquare(int n){
        if(n==1)
            return 1;
        else
            return n*n + SumSquare(n+1);
    }
}
