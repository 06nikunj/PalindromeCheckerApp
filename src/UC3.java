import java.util.Scanner;

public class UC3 {

    public static void main(String[] args){

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized Successfully.");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nInput text:");
        String str = sc.nextLine();

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}