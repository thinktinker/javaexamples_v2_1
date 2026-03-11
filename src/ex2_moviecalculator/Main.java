package ex2_moviecalculator;

import java.util.Scanner;

public class Main {

    /*
    Normal ticket	    7 Euros
    Below 5	            60% Discount
    Over 60	            55% Discount
    */

    public static double ticketPrice(int age){

        double ticketPrice = 7;

        if(age > 60)
            return ticketPrice * 0.45;
        else if(age < 5)
            return ticketPrice * 0.4;

        return ticketPrice;
    }

    public static void main(String[] args) {

        try{

            int intAge = 0;

            do {
                // 1. obtain user's input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your age: ");

                if (scanner.hasNextInt()) {
                    intAge = scanner.nextInt();
                    break;
                }

            }while(true);

            // 2. calculate the ticket price
            double dblPrice = ticketPrice(intAge);

            // 3. display ticket price according to age
            System.out.println(String.format("Your age is: %d. Please pay %.2f.", intAge, dblPrice));

        }catch (Exception ex){
            // display error message
            System.out.println("The error is: " + ex.getMessage());
        }

    }

}
