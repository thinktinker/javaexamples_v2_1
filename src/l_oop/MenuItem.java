package l_oop;

public abstract class MenuItem {

    // properties
    private String name;
    private double price;
    private double GST = 1.09;

    // constructor(s)
    // Used when we instantiate an instance of a MenuItem, but we do not know the name or price yet
    public MenuItem() {
    }

    // Overload MenuItem with more than one constructor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getGST() {
        return GST;
    }

    public void setGST(double GST) {
        this.GST = GST;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=$" + price +
                '}';
    }

    // abstract method cannot be implemented
    public abstract double calculateTotalPrice();

}
