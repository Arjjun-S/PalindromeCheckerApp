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
        System.out.println("Version 1.7");
        System.out.println("System initialized Sucessfully");
        String input = "rotator";
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();
            if (!front.equals(rear)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("The String '" + input + "' is a palindrome? " + isPalindrome);
    }
}
