public class _12_operators_in_java {
    public static void main(String [] args){
        // arithmetic operators         // don't work with booleans
        System.out.println(2+3);        // prints 5
        System.out.println(2-3);        // prints -1
        System.out.println(2*3);        // prints 6
        System.out.println(2/3);        // prints 0, since operation b/w two int vals always return an int val
        System.out.println(2.0/3);      // prints 0.6666666666666666
        System.out.println(4%3);        // prints 1, since 4/3 gives remainder 1
        System.out.println(4.4%3);      // prints 1.4000000000000004
        System.out.println(4.8%1.1);    // 0.39999999999999947
        System.out.println();

        // comparison operators         // returns boolean value
        System.out.println(2==3);       // prints false
        System.out.println(2==2);       // prints true
        System.out.println(2>3);        // prints false
        System.out.println(2>=3);       // prints false
        System.out.println(3<3);        // prints false
        System.out.println(3<=3);       // prints true

        System.out.println(2!=3);       // prints true
        System.out.println();

        // logical operators                // compares only boolean values and returns boolean values
        System.out.println(!true);          // prints false, since not of true is false
        System.out.println(!false);         // prints true, since not of false is true

        // for &&, if either is false, it returns false, otherwise true
        System.out.println(true && false);  // prints false, since one condition is false
        System.out.println(2>3 && 3>2);     // prints false, since one condition is false
        System.out.println(3>2 && 4>2);     // prints true, since both conditions are true
//        System.out.println(3 && 4);       // throws error, because && only compares boolean values

        // for ||, if either is true, it returns true, otherwise false
        System.out.println(true || false);  // prints true, since one condition is true
        System.out.println(2>3 || 3>2);     // prints true, since one condition is true
        System.out.println(3<2 || 4<2);     // prints false, since both conditions are false
//        System.out.println(3 || 4);       // throws error, because || only compares boolean values
        System.out.println();

        // bitwise operators            // works on bits (binary)

        // & bitwise operator (AND bitwise operator)
        System.out.println(2&3);        // prints 2
        // 2 in binary is 10, and 3 in binary is 11
        // comparing every 0 and 1 on respective positions
        // 1 & 1 gives 1, 1 & 0 gives 0, so outcome is : 10, which is 2 in binary
        // & means true(1) if both true(1), otherwise false(0) if either is false(0)

        // | bitwise operator (OR bitwise operator)
        System.out.println(2|3);        // prints 3
        // 2 in binary is 10, and 3 in binary is 11
        // comparing every 0 and 1 on respective positions
        // 1 | 1 gives 1, 1 | 1 gives 1, so outcome is : 11, which is 3 in binary
        // | means true(1) if either is true(1), otherwise false(0) if both is false(0)

    }
}
