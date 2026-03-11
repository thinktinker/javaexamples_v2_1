package ex1_commisionscalculator;
import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Main {

    // static function that returns the calculated commission

    /**
     * @param sales - double on the sales attained by the staff
     * @return double - the calculated commissions
     */
    public static double calculatedCommission(double sales){

        if(sales >= 10000)
            return sales * 0.3;                 // 30% commission
        else if(sales >= 5001 && sales <= 9999)
            return sales * 0.2;                 // 20% commission
        else if(sales >= 1001 && sales <= 4999)
            return sales * 0.1;                 // 10% commission

        return 0;                               // no commission at all
    }

    public static void main(String[] args) {

        try {

            // 1. Obtain the user's input
            Scanner scanner = new Scanner(System.in);
            String sales = "";
            double dblSales = 0.0;

            do {

                System.out.println("Please enter your sales figures: ");
                sales = scanner.next();

            }while (sales.isEmpty());

            // 2. To process the commission
            double commissionEarned = calculatedCommission(dblSales);

            // 3. Print the sales results
            String result = commissionEarned > 0 ? String.format("Your commission is: %.2f", commissionEarned) : "Your commission is: N/A";

            System.out.println(result);

        }catch (Exception ex){
            System.out.println(String.format("There was an error: %s", ex.getMessage()));
        }
    }
}
