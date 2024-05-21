import java.util.Scanner;
public class _26_day_of_the_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        int n = sc.nextInt();
        switch (n){
            case 1 -> System.out.println("It's Monday!");
            case 2 -> System.out.println("It's Tuesday!");
            case 3 -> System.out.println("It's Wednesday!");
            case 4 -> System.out.println("It's Thursday!");
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.println("Invalid number.");
        }
    }
}
