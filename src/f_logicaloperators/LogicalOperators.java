package f_logicaloperators;

public class LogicalOperators {

    public static void main(String[] args) {

        // declare variables
        int x, y;
        x = 10;
        y = 15;

        // comparison operation between variable x and y
        System.out.println(x == y);

        // declare variables and initialise the variables with a value
        int a = 10, b = 10;

        // comparison operation between initialised variables a and b
        System.out.println(a == b);

        // While var may be versatile, it does not necessarily apply the principles of declaring
        // with a specific data type
        var price = "100";
        System.out.println(price);

        // comparison operation between characters
        char i, j;
        i = '\t';
        j = '\t';

        System.out.println(i == j);

        // comparison operation between boolean
        boolean t, f;
        t = true;
        f = false;

        System.out.println(t == f);
    }
}
