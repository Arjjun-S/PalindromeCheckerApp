import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
class PalindromeService {
    private String text;
    public PalindromeService(String text) {
        this.text = text;
    }
    public boolean check() {
        if (text == null) return false;
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
public class PalindromeCheckerApp
{
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.11");
        System.out.println("System initialized Sucessfully");
        String input = "No 'x' in Nixon";
        PalindromeService service = new PalindromeService(input);
        boolean result = service.check();
        System.out.println("Input: " + input);
        System.out.println("Result (OOPS): Is it a palindrome? " + result);
    }
}