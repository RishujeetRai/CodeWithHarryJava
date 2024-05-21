import java.util.Scanner;

public class _15_greater_than_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        boolean b = a>n;
        System.out.println(a+">"+n+": "+b);
    }
}
