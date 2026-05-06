package l_oop;

public class Main {

    public static void main(String[] args) {

        // Creating instances of the Beverage class (object)
        Beverage beverage1 = new Beverage("Cappucino", 5, false);
        Beverage beverage2 = new Beverage("Expresso", 3, true);

        System.out.println(beverage1.toString());
        System.out.println("Please pay: $" + beverage1.calculateTotalPrice());

        System.out.println(beverage2.toString());
        System.out.println("Please pay: $" + beverage2.calculateTotalPrice());

        Food foodItem1 = new Food("Hawaiian Pizza", 9.90, false);
        System.out.println(foodItem1.toString());


    }
}
