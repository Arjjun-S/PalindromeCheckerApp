import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.13");
        System.out.println("System initialized Successfully");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000; i++) sb.append("a");
        String largeInput = sb.toString();
        long startTimeStack = System.nanoTime();
        checkStack(largeInput);
        long endTimeStack = System.nanoTime();
        long durationStack = endTimeStack - startTimeStack;
        long startTimePointer = System.nanoTime();
        checkPointer(largeInput);
        long endTimePointer = System.nanoTime();
        long durationPointer = endTimePointer - startTimePointer;
        System.out.println("-----------------------------------------");
        System.out.println("Algorithm Type      | Execution Time (ns)");
        System.out.println("-----------------------------------------");
        System.out.println("Stack-Based         | " + durationStack);
        System.out.println("Two-Pointer         | " + durationPointer);
        System.out.println("-----------------------------------------");
        if (durationPointer > 0) {
            double speedup = (double)durationStack / durationPointer;
            System.out.printf("Insight: Two-Pointer is %.2fx faster than Stack.%n", speedup);
        }
    }

    private static void checkStack(String input) {
        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray()) {
            s.push(c);
        }
        StringBuilder rev = new StringBuilder();
        while (!s.isEmpty()) {
            rev.append(s.pop());
        }
        input.equals(rev.toString());
    }
    private static void checkPointer(String input) {
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i++) != input.charAt(j--)) {
                break;
            }
        }
    }
}
