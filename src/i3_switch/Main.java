package i3_switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);
        String quantity = "";
        String discount = "";

        // ask for the user input on the quantity purchased
        do{
            System.out.print("Please enter your purchase quantity: ");
            quantity = scanner.nextLine();
        }while(quantity.isEmpty());

        // ask for the user input on the discount coupon on-hand
        do {
            System.out.print("Please enter your discount: ");
            discount = scanner.nextLine();
        }while (discount.isEmpty());

        // local variables to convert String values to primitive int
        int qty = Integer.parseInt(quantity);
        int disc = Integer.parseInt(discount);
        String result = "";

        // switch-case statement with nested conditions
        switch (disc){
            case 20:
                // if the user as a 20% discount coupon and purchases > 5 items
                result = (qty > 5) ? "increased to 25%" : "20%";
                break;
            case 30:
                // if the user as a 30% discount coupon and purchases > 5 items
                result = (qty > 5) ? "increased to 35%" : "30%";
                break;
            default:
                result = "10%.";
        }

        System.out.println(String.format("Your total discount is %s", result));
    }

}
