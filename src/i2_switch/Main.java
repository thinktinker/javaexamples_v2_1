package i2_switch;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the full day of the week
        LocalDate today = LocalDate.now();
        today = today.plusDays(5);                  // set the day to the weekend
        DayOfWeek dayOfWeek = today.getDayOfWeek(); // today is monday
        double cost = 0;                            // create a local variable for cost

        // provide feedback to the user on the chosen day
        switch (dayOfWeek.toString().toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday":
                cost = 1;
                break;
            default:
                cost = 1.3;
        }

        System.out.println(String.format("Today is %s. Please pay $%.2f for entry.", dayOfWeek.toString(), cost));

    }
}
