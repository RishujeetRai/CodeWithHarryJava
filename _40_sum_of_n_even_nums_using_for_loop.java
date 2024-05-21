public class _40_sum_of_n_even_nums_using_for_loop {
    public static void main(String[] args) {
        int n = 100, sum=0;
        for(int i=1; i<=n; i++){
            sum = sum + 2*i;
        }
        System.out.println("The sum is: "+sum);
    }
}
