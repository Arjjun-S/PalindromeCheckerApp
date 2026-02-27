import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
interface PalindromeStrategy {
    boolean isValid(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return cleaned.equals(reversed.toString());
    }
}
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isValid(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left++) != cleaned.charAt(right--)) return false;
        }
        return true;
    }
}
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isValid(input);
    }
}
public class PalindromeCheckerApp
{
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.12");
        System.out.println("System initialized Sucessfully");
        String input = "Was it a car or a cat I saw?";
        PalindromeContext context = new PalindromeContext();
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(input));
        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Using Two-Pointer Strategy: " + context.executeStrategy(input));

    }
}