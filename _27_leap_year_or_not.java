import java.util.Scanner;
public class _27_leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if(year%100==0){        // if year is divisible by 100
            if(year%400==0){    // then it should be divisible by 400 too to be leap year
                System.out.println("Leap year.");
            }
            else System.out.println("Not leap year");
        }
        else if(year%4==0){     // if not divisible by 100 but divisible by 4, then it's leap year too
            System.out.println("Leap year.");
        }
        else System.out.println("Not leap year.");      // otherwise not a leap year
    }
}
