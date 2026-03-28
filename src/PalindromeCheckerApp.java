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
        System.out.println("Version 1.8");
        System.out.println("System initialized Sucessfully");
        String input = "level";
        LinkedList<Character> ll = new LinkedList<Character>();
        for (char ch : input.toCharArray()) {
            ll.add(ch);
        }
        boolean isPalindrome = true;
        while (ll.size() > 1) {
            if (!ll.pollFirst().equals(ll.pollLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("UC8 Result: Is '" + input + "' a palindrome? " + isPalindrome);
    }
}