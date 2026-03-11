package j_dowhile;

public class Fibonacci {

    // each number is the sum of the two preceding ones, starting from 0 and 1.
    // 0 1 1 2 3 5 8 13 21 34 55 89 ... 100
    //   1   2   5

    public static void main(String[] args) {

        int num1 = 0, num2 = 1;                     // initial value
        int nextNum;                                // store the value to be added in the next sequence
        int max = 100;                              // maximum iterations of the fibonnaci sequence

        do {

            System.out.print(num1 + ", ");          // print out num1

            nextNum = num1 + num2;                  // added num1 and num2 to nextNum for the next sequence

            if(nextNum <= max){                     // if nextNum is less than or equal max
                num1 = num2;                        // store num2 into num1
                num2 = nextNum;                     // store nextNum into num2

            }else {                                 // otherwise we exit the loop
                System.out.println(num2);           // print out the final value
                break;
            }

        }while(num2 <= max);
    }
}
