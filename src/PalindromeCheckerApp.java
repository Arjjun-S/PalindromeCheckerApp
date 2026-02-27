import java.util.Scanner;
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version 1.0");
        System.out.println("System initialized Sucessfully");
        String input="madam";
        char[] test= input.toCharArray();
        int n=input.length()-1;
        int j=0;
        for(int i=0;i<input.length()/2;i++)
        {
            if(test[i]!=(test[n])){
                System.out.print("The String is not palindrome");
                j=1;
                break;
            }
            n--;
        }
        if(j==0){
            System.out.print("The String is palindrome");
        }
    }
}