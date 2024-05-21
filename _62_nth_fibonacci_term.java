public class _62_nth_fibonacci_term {
    static int nthFibonacci(int n){
        if(n<=0) return -1;         // for invalid n
        else if(n==1) return 0;
        else if(n==2) return 1;
        else return nthFibonacci(n-1)+nthFibonacci(n-2);
        // In Fibonacci series, F(n) = F(n-1) + F(n-2), and F(1)=0, and F(2)=1
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(1));
        System.out.println(nthFibonacci(2));
        System.out.println(nthFibonacci(3));
        System.out.println(nthFibonacci(4));
        System.out.println(nthFibonacci(5));
        System.out.println(nthFibonacci(6));
        System.out.println(nthFibonacci(7));
        System.out.println(nthFibonacci(8));
        System.out.println(nthFibonacci(9));
        System.out.println(nthFibonacci(10));
    }
}
