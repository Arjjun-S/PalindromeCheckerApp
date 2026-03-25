import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.4");
        System.out.println("System initialized Sucessfully");
        String input = "level";
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("UC4 Result: Is '" + input + "' a palindrome? " + isPalindrome);
    }
}
