package l_oop_addon.compiletime_polymorphism;

public class Calculator {

    public static String add(int a, int b){
        return String.format("Add integers: %d", a + b);
    }

    public static String add(double a, double b){
        return String.format("Add doubles: %.2f", a + b);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.add(123, 14));
        System.out.println(Calculator.add(18.3, 1.9));
        System.out.println(Calculator.add(11, (int)15.0));
    }

}
