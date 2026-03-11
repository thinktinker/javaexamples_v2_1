package c_weightguru;

import java.util.Scanner;

public class WeightGuru {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputWeight;
        String inputHeight;
        boolean quitFlag = false;

        do {
            System.out.println("Please enter your weight in kg: ");
            inputWeight = scanner.next();

            if (inputWeight.toLowerCase().equals("q"))
                System.exit(0); // break;

            System.out.println("Please enter your height in cm: ");
            inputHeight = scanner.next();

            if(inputHeight.toLowerCase().equals("q")){
                System.exit(0); // break;
            }

            // convert the value to double for calculation
            double weight = Double.parseDouble(inputWeight);
            double height = Double.parseDouble(inputHeight) ;

            // calculate the BMI
            double bmi = weight / Math.pow(height/100, 2);

            if(bmi >= 18.5 && bmi <= 25)
                System.out.println(String.format("**************************\nYour BMI of %.2f is Good.\n**************************", bmi));
            else
                System.out.println(String.format("*********************************\nYour BMI of %.2f, can be better.\n*********************************", bmi));

        }while (true);
    }
}
