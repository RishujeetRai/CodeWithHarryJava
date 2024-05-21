import java.util.Scanner;
public class _33_sum_of_n_even_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0, i = 0;
        while(n>i){
            i=i+1;              // i ranges from 0 to n, incrementing by 1 in every iteration
            sum = sum+2*i;      // adding 2*i in sum for every i
        }
        System.out.println("The sum of first "+n+" even numbers are: "+sum);
    }
}
