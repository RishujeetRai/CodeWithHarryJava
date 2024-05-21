public class _61_fibonacci_series {
    static void fibonacci(int n){
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        n = n-2;
        while(n--!=0){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
