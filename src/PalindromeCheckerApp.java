import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.3");
        System.out.println("System initialized Sucessfully");

        String original = "racecar";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }
    }
}
