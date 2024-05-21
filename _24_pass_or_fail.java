import  java.util.Scanner;

public class _24_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float phys, chem, maths, tots;
        System.out.print("Enter total marks: ");
        tots = sc.nextFloat();
        System.out.print("Enter marks for physics: ");
        phys = sc.nextFloat();
        System.out.print("Enter marks for chemistry: ");
        chem = sc.nextFloat();
        System.out.print("Enter marks for maths: ");
        maths = sc.nextFloat();

        float totsPercen = ((phys+chem+maths)/(3*tots))*100;
        float physPercen = (phys/tots)*100;
        float chemPercen = (chem/tots)*100;
        float mathsPercen = (maths/tots)*100;
        if(totsPercen<40.0 || physPercen<33.0 || chemPercen<33.0 || mathsPercen<33.0){
            System.out.println("Failed.");
        }
        else System.out.println("Passed");
    }
}
