import java.util.Scanner;

public class _124_valid_use_of_finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(true){
            try{
                System.out.println("The division returns: "+a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Finally block, for b="+b);
            }
            b--;
        }
    }
}
