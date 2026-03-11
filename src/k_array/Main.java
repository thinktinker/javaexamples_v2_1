package k_array;

public class Main {

    public static void main(String[] args) {

        // 1. Declare an array
        int[] myArray;
        myArray = new int[]{0, 1, 2};   // create a NEW INSTANCE of an array with initialised values of 0 to 2

        // 2. Declare and initialise an array (at the same time)
        int[] myArray2 = {0, 1, 2};

        // 3. Declare an initialise an array (2nd approach)
        int myArray3[] = {0, 1 , 2};

        // 4. Declare an array with a length of 4 integer values
        int myArray4[] = new int[4];

        // When do we declare and initalise an array at the same time (approach 1 - 3)

        // 1. We have PRE-DETERMINED data on hand
        String[] startingPlayers = {"Jordan", "Pippen", "Grant", "Cartwright", "Paxson"};

        // 2. When we don't have the data on hand yet (but we know the data type)
        String[] playerRoster = new String[5];
        playerRoster[0] = "Steph Curry";
        playerRoster[1] = "Draymond Green";
        playerRoster[2] = "Gary Payton";
        playerRoster[3] = "Klay Thomson";
        playerRoster[4] = "Moses Moody";

        // print out the data of startingPlayers array
        for (int i = 0; i < startingPlayers.length; i++) {
            System.out.println(i+1 + ". Starting Player: " + startingPlayers[i]);
        }

        // for-each loop (built-in structure, does not have index)
        for (String player : playerRoster) {
            System.out.println("Rostered Player: " + player);
        }

        // Scenario #1: only work with th data in array scores when there is a value
        // Test initial values of an instance of a new array called scores (0 - 10, e.g. 7.5)
        double[] scores = new double[5];

        for (double score : scores) {
            System.out.println(score);  // 0.0 (default values) printed 5 times
        }

        // give index 2 a score of 7.5
        scores[2] = 7.5;

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > 0)
                System.out.println("Score found in index " + i + " where the score is: " + scores[i]);
        }

        // Scenario #2: only work with data of an array namesArr where there is a value
        String[] namesArr = new String[4];  // initialised with a value of null

        // give index 2 a name: "John Doe"
        namesArr[2] = "John Doe";

        for (int i = 0; i < namesArr.length; i++) {
            if(namesArr[i] != null)
                System.out.println(i+1 + ". name: " + namesArr[i]);
        }

    }
}
