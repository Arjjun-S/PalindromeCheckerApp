import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.10");
        System.out.println("System initialized Sucessfully");
        String input = "A man a plan a canal Panama";
        String cleaned = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original: " + input);
        System.out.println("Cleaned:  " + cleaned);
        boolean isPalindrome = true;
        int start = 0;
        int end = cleaned.length() - 1;
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Result: Is it a palindrome? " + isPalindrome);
    }
}