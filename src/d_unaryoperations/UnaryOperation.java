package d_unaryoperations;

public class UnaryOperation {

    public static void main(String[] args) {

        // unary minus (-) operation
        int value1 = -10;
        int value2 = -value1; // -1 * -10

        System.out.println("Value of value1: " + value1); // -10
        System.out.println("Value of value2: " + value2); // 10

        // unary add (+) operation
        int value3 = -10;
        int value4 = +(value3); // 1 * -10

        System.out.println("Value of value3: " + value3); // -10
        System.out.println("Value of value4: " + value4); // -10

        // unary add (+) operation on a character
        Character keyboardKey = 'A';         // what is the ASCII value of A
        int asciiKey = +keyboardKey;    // type conversion from char to int

        System.out.println("The ascii value of " + keyboardKey + " is " + asciiKey);

    }

}
