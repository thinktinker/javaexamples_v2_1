package e_myfirstinput;

import java.io.Console;

public class MyFirstInput {

    public static void main(String[] args) {

        Console console = System.console();
        System.out.print("PLease enter your name:");
        String name = console.readLine();
        System.out.println(String.format("Welcome %s.", name));
    }

}
