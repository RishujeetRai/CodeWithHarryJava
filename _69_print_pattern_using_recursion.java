public class _69_print_pattern_using_recursion {
    static void printPattern(int n){
        if(n>0){
            printPattern(n-1);              // recursion before printing
            for(int i=1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Working of this recursive method:
    // printPatter(3)
    // printPattern(2) + 3 times start and a newline
    // printPattern(1) + 2 times star and a newline + 3 times star and a newline
    // printPattern(0) + 1 times start and a newline + 2 times star and a newline + 3 times star and a newline

    public static void main(String[] args) {
        printPattern(4);
    }
}
/*
     *
     **
     ***
     ****
*/