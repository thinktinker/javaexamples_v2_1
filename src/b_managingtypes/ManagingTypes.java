package b_managingtypes;

import java.util.Scanner;

public class ManagingTypes {

    /**
     *
     * @param price (double)
     * @param discount (int)
     */
    public static void calculateDiscount(double price, int discount){

        double paymentAmount =  price - (price * discount/100);

        System.out.println(String.format("After discount, your payable amount is: %.2f", paymentAmount));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String paymentPrice = scanner.next();

        int discountPercent = 10;

        calculateDiscount(Double.parseDouble(paymentPrice), discountPercent);

    }
}
