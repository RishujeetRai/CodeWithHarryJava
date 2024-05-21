import java.util.Scanner;
public class _34_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table:");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }
}
