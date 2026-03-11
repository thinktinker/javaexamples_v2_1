package j_whileloop;

import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

        //TODO implement While loop to get print result

        int stepper = 1;        // stepper
        int max = 10;           // max. value to step through

        while (stepper <= max){ // condition

            String result = String.format("%d x %d = %d", stepper, num, stepper * num);
            System.out.println(result);

            stepper++;          //stepper to increase by 1
        }
    }
}