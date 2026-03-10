import java.util.Scanner;

public class UC2 {

    public static void main(String[] args){

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized Successfully.");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nInput text:");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int n = str.length();

        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}