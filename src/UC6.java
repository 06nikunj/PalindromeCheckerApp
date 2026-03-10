import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UC6 {

    public static void main(String[] args){

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
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

    // Method using Stack and Queue
    public static boolean isPalindrome(String str) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters
        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Compare
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

