import java.util.Scanner;
public class _36_factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial:");
        int n = sc.nextInt();
        int f = 1;
        if(n==0 || n==1) System.out.println("Factorial is: "+f);
        else{
            for(int i=1; i<=n; i++){
                f = f*i;
            }
            System.out.println("Factorial is: "+f);
        }
    }
}
