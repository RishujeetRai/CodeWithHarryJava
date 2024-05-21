import java.util.Scanner;

public class _10_kilometers_to_meters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in kilometers: ");
        float km = sc.nextFloat();
        float m = km*1000;
        System.out.print("The value in meters is: "+m+" meters.");
    }
}
