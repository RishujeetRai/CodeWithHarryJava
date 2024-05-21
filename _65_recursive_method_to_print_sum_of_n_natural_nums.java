public class _65_recursive_method_to_print_sum_of_n_natural_nums {
    static int sum(int n){
        if(n<=0) return 0;
        else if(n==1) return 1;     // base condition
        else return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 0 natural numbers is: "+sum(0));
        System.out.println("The sum of first 1 natural numbers is: "+sum(1));
        System.out.println("The sum of first 2 natural numbers is: "+sum(2));
        System.out.println("The sum of first 3 natural numbers is: "+sum(3));
        System.out.println("The sum of first 4 natural numbers is: "+sum(4));
        System.out.println("The sum of first 5 natural numbers is: "+sum(5));
        System.out.println("The sum of first 6 natural numbers is: "+sum(6));
        System.out.println("The sum of first 7 natural numbers is: "+sum(7));
        System.out.println("The sum of first 8 natural numbers is: "+sum(8));
        System.out.println("The sum of first 9 natural numbers is: "+sum(9));
        System.out.println("The sum of first 10 natural numbers is: "+sum(10));
    }
}
