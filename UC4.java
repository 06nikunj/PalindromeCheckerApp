import java.util.Scanner;

public class UC4 {

    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 4.0");
        System.out.println("System initialized Successfully.");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nInput text:");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }

    // Method to check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
