package l_oop;

/**
 * Class Beverage is a subclass of MenuItem
 * and that it contains all the properties and methods
 * from the parent class called MenuItem
 */
public class Beverage extends MenuItem{

    private boolean isCold;
    private static final String[] VALID_BEVERAGES = new String[]{"latte", "cappucino", "expresso"};
    private static final double MIN_PRICE = 3;

    public Beverage(String name, double price, boolean isCold){
        this.setName(name);
        this.setPrice(price);
        this.isCold = isCold;
    }

    // Create the getters and setters
    // rely on the parent class' getter methods: getName(), getPrice()

    // we need to customise setName() to ensure that only valid names are applicable
    public void setName(String name){
        String lowerCaseBeverageName = name.toLowerCase();
        for (String valid_beverage : VALID_BEVERAGES) {
            if(valid_beverage.equals(lowerCaseBeverageName)){
                super.setName(name);
                return;
            }
        }
        throw new IllegalArgumentException("Beverage names allowed: " + String.join(", ", VALID_BEVERAGES));
    }

    // we need to customise setPrice(), to ensure that the price is a positive value
    public void setPrice(double price){
        if(price >= MIN_PRICE){
            super.setPrice(price);
            return;
        }
        throw new IllegalArgumentException("Minimum price of beverage must be $3 and above.");
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    @Override
    public double calculateTotalPrice() {
        return this.getPrice() * super.getGST();
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + this.getName() + '\'' +
                " price=$'" + this.getPrice() + '\'' +
                " isCold=" + isCold +
                '}';
    }
}
