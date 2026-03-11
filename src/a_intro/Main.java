package a_intro;

public class Main {
    public static void main(String[] args) {

        // 1. Narrow Typecasting
        // convert the value of 100.04 to a long (64 bit)
        double d = 100.4;

        // explicitly typecast double to long (narrow typecasting)
        long l = (long) d;

        // explicitly typecast long to int
        int i = (int) l;

        System.out.println("The double value of d: " + d);
        System.out.println("The long value of l: " + l);
        System.out.println("The int value of i: " + i);

        // 2. Widening Typecasting
        // typecasting does not require explicit typecasting process
        float f = l;

        double d2 = f;

        System.out.println("The float value of f: " + f);
        System.out.println("The double value of d2: " + d2);

    }
}