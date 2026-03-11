package i1_switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for values between 0 - 3
        System.out.println("Please provide a number between 0 - 3");
        int input = scanner.nextInt();

        // Print out the feedback, using a switch-case statement
        switch (input){
            case 0:
                System.out.println("is 0");
                break;
            case 1:
                System.out.println("is 1");
                break;
            case 2: // if input == 2
            case 3: // or input == 3
                System.out.println("is 2 or 3");
                System.out.println("Actual output: " + input);
                break;
            default:
                System.out.println("value is invalid");
                break;
        }
    }
}
