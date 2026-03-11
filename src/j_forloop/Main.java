package j_forloop;

import java.util.Scanner;

public class Main {

    /*
        Use the for loop to create a program that ask the user to input a name and then prints each of the letters of the name
        Hint: You can use the following String functions:

        length(): returns the total number of characters of a given String
        chartAt(i): returns the character at the given position(i) of a String
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Please enter your name: ");
            name = scanner.next();
        }while (name.isEmpty());

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.print(letter + " ");
        }

    }
}
