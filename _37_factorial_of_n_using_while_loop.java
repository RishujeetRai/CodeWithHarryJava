import java.util.Scanner;
public class _37_factorial_of_n_using_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial:");
        int n = sc.nextInt();
        int f = 1;
        if(n==0 || n==1) System.out.println("Factorial is: "+f);
        else{
            while(n>0){
                f = f*n;
                n--;
            }
            System.out.println("Factorial is: "+f);
        }
    }
}
