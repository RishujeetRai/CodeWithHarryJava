public class _38_pattern_using_while_loop {
    public static void main(String[] args) {
        int m = 5;
        while(m>0){
            int n = m;
            while(n>0){
                System.out.print("*");
                n--;
            }
            System.out.println();
            m--;
        }
    }
}
