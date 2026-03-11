package g_classgrader;

import java.util.Scanner;

public class ClassGrader {

    public static void main(String[] args) {

        // scanner to obtain the user input
        Scanner scanner = new Scanner(System.in);

        // Get the score from the user's input
        System.out.println("Please enter your score:");
        Integer score = scanner.nextInt();

        /*
            Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
            Failed if they scored 3 or less
            Insufficient if they scored > 3 but less than 5. (5 included)
            Good if they scored > 5 but less than 8. (8 included)
            Excellent Grade if they scored 10.

            Challenge:
            if participants enter a negative number or a number outside the range supported (outside 0 - 10)
            inform the user that the number is invalid
        */

        if(score < 0 || score > 10){
            System.out.println("Your input is invalid (min: 0, max 10)!");
            System.exit(0);
        }

        String feedback = "";

        if(score.equals(10) || score.equals(9))
            feedback = "Excellent";
        else if(score <= 8 && score > 5 )
            feedback = "Good";
        else if(score <=5 && score > 3)
            feedback = "Insufficient";
        else if(score <= 3)
            feedback = "Failed";

        String result = String.format("Your score is %d. And your grade is: %s.", score, feedback);

        System.out.println(result);

    }
}
