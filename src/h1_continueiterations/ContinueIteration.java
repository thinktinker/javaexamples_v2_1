package h1_continueiterations;

public class ContinueIteration {

    public static void main(String[] args) {

        int max = 10;

        // 1. for loop (print odd numbers)
        for (int i = 0; i <= max; i++) {

            // if even number, skip the iteration
            if(i % 2 == 0)
                continue;

            System.out.println(i);
        }

        int stepper = 1;

        // 2. do-while loop
        do {

            // print only odd numbers
            if(stepper % 2 == 0){
                stepper++;  // increment stepper by 1
                continue;
            }

            // print the output
            System.out.println("stepper:" + stepper);
            stepper++;      // increment stepper by 1

        }while(stepper <= max);

    }

}
