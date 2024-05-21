import java.util.Scanner;

public class _126_max_retries_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {32,132,132,213,123,123,213,213,213,213,21,3,31,231,213,231,123,13};
        int max=0;
        while(true){
            try{
                System.out.print("Enter an index to get its value from the array: ");
                int a = sc.nextInt();
                if(a<0 || a>arr.length){
                    throw new Exception();
                }
                System.out.println("The respective value is: "+arr[a]);
            }
            catch (Exception e){
                max++;
                if(max>5){
                    System.out.println("Enough of your invalid indices, you damn imbecile!");
                    break;
                }
                System.out.println("Enter a valid index, please.");
            }
        }
    }
}
