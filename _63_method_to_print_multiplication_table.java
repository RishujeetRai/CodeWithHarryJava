public class _63_method_to_print_multiplication_table {
    static void table(int n){
        System.out.println("The multiplication table of "+n+" is:");
        for(int i=1; i<=10; i++){
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        table(8);
    }
}
