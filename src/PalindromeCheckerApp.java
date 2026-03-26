import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.6");
        System.out.println("System initialized Sucessfully");
        String input = "deified";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The String '" + input + "' is a palindrome.");
        } else {
            System.out.println("The String '" + input + "' is not a palindrome.");
        }
    }
}
