public class _66_method_to_print_pattern {
    static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i+1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
/*
    ****
    ***
    **
    *
*/