import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        PalindromeCheckerApp t=new PalindromeCheckerApp();
        t.Usecase1();
        t.Usecase2();
        t.Usecase3();
    }
    static void Usecase1(){
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.0");
        System.out.println("System initialized Sucessfully");
    }
    static void Usecase2()
    {
        String input="madam";
        char[] test= input.toCharArray();
        int n=input.length()-1;
        int j=0;
        for(int i=0;i<input.length()/2;i++)
        {
            if(test[i]!=(test[n])){
                System.out.println("The String is not palindrome");
                j=1;
                break;
            }
            n--;
        }
        if(j==0){
            System.out.println("The String is palindrome");
        }
    }
    static void Usecase3() {
        String original = "racecar";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
            if (original.equals(reversed)) {
                System.out.println("The String is a palindrome");
            } else {
                System.out.println("The String is not a palindrome");
            }
    }
    static void Usecase4() {
        String input = "level";
        // Convert string to char array
        char[] charArray = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison logic
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++; // Move forward from start
            end--;   // Move backward from end
        }

        System.out.println("UC4 Result: Is '" + input + "' a palindrome? " + isPalindrome);
    }
}
