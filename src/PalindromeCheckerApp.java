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
        System.out.println("Version 1.9");
        System.out.println("System initialized Sucessfully");
        String input = "malayalam";
        boolean isPalindrome = checkRecursive(input, 0, input.length() - 1);
        System.out.println("Result: Is '" + input + "' a palindrome? " + isPalindrome);
    }
    static boolean checkRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkRecursive(str, start + 1, end - 1);
    }
}