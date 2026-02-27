import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.5");
        System.out.println("System initialized Sucessfully");
        System.out.println("Executing UC5: Stack-Based Palindrome Check");
        String input = "radar";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        if (input.equals(reversed)) {
            System.out.println("The String '" + input + "' is a palindrome.");
        } else {
            System.out.println("The String '" + input + "' is not a palindrome.");
        }
    }
}
