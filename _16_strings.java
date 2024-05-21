public class _16_strings {
    public static void main(String[] args) {
        // in java, string is treated as a class as well as a primitive datatype
        String str = new String("Rocky Bhai");
        System.out.println(str);
        String s = "ROCKY BHAI";        // also valid
        System.out.println(s);

        int a = 6;
        float b = 6.6f;
        System.out.printf("The int val is %d and float val is %f\n",a,b);   // printf
        // %d for int, %f for float, %c for char, %s for string: these are format specifiers
        System.out.format("The int val is %d and float val is %f",a,b);     // works in same way
    }
}
