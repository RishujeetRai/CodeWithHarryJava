public class _68_print_pattern_using_recursion {
    static void printPattern(int n){
        if(n==0) System.out.println(-1);            // for invalid n
        else if(n==1) System.out.print("*");        // base condition
        else{
            for(int i=n; i>=1; i--){
                System.out.print("*");
            }
            System.out.println();
            printPattern(n-1);
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
/*
    ****
    ***
    **
    *
*/