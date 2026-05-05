package l_oop;

public class Main {

    public static void main(String[] args) {

        // Creating instances of the Beverage class (object)
        Beverage beverage1 = new Beverage("Hot Americano", 5, false);
        Beverage beverage2 = new Beverage("Ice Coffee", 4, true);

        System.out.println(beverage1.toString());
        System.out.println("Please pay: $" + beverage1.calculateTotalPrice());

        System.out.println(beverage2.toString());
        System.out.println("Please pay: $" + beverage2.calculateTotalPrice());

    }
}
