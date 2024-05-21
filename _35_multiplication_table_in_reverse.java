import java.util.Scanner;
public class _35_multiplication_table_in_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table in reverse:");
        int n = sc.nextInt();
        for(int i=10; i>=1; i--){
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }
}
