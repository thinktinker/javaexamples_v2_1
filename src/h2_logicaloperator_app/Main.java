package h2_logicaloperator_app;

import h2_logicaloperator_app.grader.Grader;
import h2_logicaloperator_app.utils.PrinterHelper;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        char option;                                // character: option
        int grade;                                  // integer: grade
        Scanner scanner = new Scanner(System.in);   // Scanner object to obtain user input

        // We are only expecting two values:
        // 'a' - move on to ask for the user's grade
        // 'b' - end the program
        // Wait for the user to input / continue with the program

        do {

            // Show main menu when the program run
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);      // obtain the character from user's input (string) at index[0]

            if(option != 'a')                       // if the user's input is not 'a', we skip the iteration
                continue;
            else if(option == 'b')                  // break out of the loop (end program) if user input is 'b'
                System.exit(0);

            // Ask the user the enter the grade
            PrinterHelper.showGradeMenu();
            grade = scanner.nextInt();

            // Create an instance of Grader and pass the value of grade to it
            Grader grader = new Grader(grade);

            // Print out the grade via PrinterHelper
            PrinterHelper.showGradeFeedback(grader.showGrade());

        }while ( option != 'b');                    // continue with loop if option != b
    }
}
