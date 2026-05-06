package l_oop;

/*
1. Use the base class called MenuItem that handles basic details like name and price.
2. Refine the Food subclass to ensure it calculates the final price correctly including tax.
3. Applicable concepts:
    - inheritance ✅
    - encapsulation ✅
    - polymorphism ✅, and
    - use the super keywords in Java by completing the subclass
*/

public class Food extends MenuItem {

    // properties
    private boolean isVegetarian;

    // constructor(s)
    public Food(String name, double price, boolean isVegetarian){
        super(name, price);
        this.isVegetarian = isVegetarian;
    }

    // method(s)
    // getters and setters (encapsulation)
    // Is there a need in Food.java where we create the getters and setters for getName(), setName(), getPrice(), setPrice()
    // Ans: NO
    // getName(), setName(), getPrice(), setPrice() is also inherited.

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double calculateTotalPrice() {
        return super.getPrice() * super.getGST();
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + super.getName() + '\'' +
                " price=$'" + super.getPrice() + '\'' +
                " isVegetarian=" + isVegetarian() +
                '}';
    }

}
