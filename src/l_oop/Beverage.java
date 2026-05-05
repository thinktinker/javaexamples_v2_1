package l_oop;

/**
 * Class Beverage is a subclass of MenuItem
 * and that it contains all the properties and methods
 * from the parent class called MenuItem
 */
public class Beverage extends MenuItem{

    private boolean isCold;

    public Beverage(String name, double price, boolean isCold){
        super(name, price);
        this.isCold = isCold;
    }

    // Create the getters and setters
    public String getName(){
        return super.getName();
    }

    public void setName(String name){
        super.setName(name);
    }

    public double getPrice(){
        return super.getPrice();
    }

    public void setPrice(double price){
        super.setPrice(price);
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
