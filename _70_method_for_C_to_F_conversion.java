public class _70_method_for_C_to_F_conversion {
    static float CtoF(float C){
        return C*(9.0f/5) + 32;     // make sure to be working with float values
    }

    public static void main(String[] args) {
        System.out.println("0 C in F is: "+CtoF(0));
        System.out.println("1 C in F is: "+CtoF(1));
        System.out.println("23 C in F is: "+CtoF(23));
        System.out.println("50 C in F is: "+CtoF(50));
        System.out.println("100 C in F is: "+CtoF(100));
    }
}
