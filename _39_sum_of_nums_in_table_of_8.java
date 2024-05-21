public class _39_sum_of_nums_in_table_of_8 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = sum + (8*i);
        }
        System.out.println("The sum is: "+sum);
    }
}
