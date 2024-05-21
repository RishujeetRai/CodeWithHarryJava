import java.util.Scanner;

public class _08_cbse_percentage_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        float total = sc.nextFloat();
        System.out.print("Enter marks for subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter marks for subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter marks for subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter marks for subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter marks for subject 5: ");
        float sub5 = sc.nextFloat();
        float percen = ((sub1+sub2+sub3+sub4+sub5)/(5*total))*100;
        System.out.print("The percentage is: "+percen);
    }
}
