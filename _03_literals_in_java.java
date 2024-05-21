public class _03_literals_in_java {
    public static void main(String[] args) {

        byte b = 99;                    // can have only up to two digits
        int i = 999999999;              // can have up to nine digits
        short s = 9999;                 // can have only up to four digits
        long l = 999999999999999999l;   // can have up to 18 digits, suffixed with l or L

        float f = 3;                    // is 3.0
//      float f1 = 3.0;                 // gives error as decimals in java are by default double
        float f1 = 3.0f;                // so we use suffix f or F
        System.out.println(f);

        double d = 3;                   // is also 3.0
        double d1 = 3.0;                // valid without the suffix since decimals are by default double
        double d2 = 3.0d;               // is also 3.0, same as 3.0D
        System.out.println(d);

        boolean t = true;               // booleans can have true or false
        System.out.println(t);          // will print: true

        String str = "Boom. You looking for this?";     // string literal
        System.out.println(str);
    }
}
