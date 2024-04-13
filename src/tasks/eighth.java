package tasks;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        if (checker(s)) {
            System.out.println(s + " - yes");
        } else {
            System.out.println(s + " - no");
        }
    }
    // true - yes, false - no
    public static boolean checker(String s) {
        // if string is empty, return true
        if (s.isEmpty()){
            return true;
        }
        else{
            // i extract the first character from the string s and assign it to the firstChar variable.
            char firstChar = s.charAt(0);
            // using the function I check whether the first element is a number
            if(Character.isDigit(firstChar)){
                // the rest of the string is checked recursively
                return checker(s.substring(1));
            }
            else{
                return false;
            }
        }

    }


}
