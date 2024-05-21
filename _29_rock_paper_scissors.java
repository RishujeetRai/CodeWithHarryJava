import java.util.Random;        // Random class to generate random numbers
import java.util.Scanner;
public class _29_rock_paper_scissors {
    public static void main(String[] args) {
        Random a = new Random();        // creating object to call Random class' methods
        Scanner sc = new Scanner(System.in);
        int compChoice = a.nextInt(1,4);         // nextInt() method to get a random int
        // note: we used the version of this method with bound limits
        // here, lower limit is inclusive while the upper limit is exclusive
        // 1 and 4 as lower and upper limits, to get any number between 1, 2 and 3 randomly
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissors");
        System.out.println("4 to exit.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 -> {
                if(compChoice==1) System.out.println("Tied.");
                if(compChoice==2) System.out.println("Computer chose Paper. YOU LOST.");
                if(compChoice==3) System.out.println("Computer chose Scissors. YOU WON.");
            }
            case 2 -> {
                if(compChoice==1) System.out.println("Computer chose Rock. YOU WON.");
                if(compChoice==2) System.out.println("Tied.");
                if(compChoice==3) System.out.println("Computer chose Scissors. YOU LOST.");
            }
            case 3 -> {
                if(compChoice==1) System.out.println("Computer chose Rock. YOU LOST.");
                if(compChoice==2) System.out.println("Computer chose Paper. YOU WON.");
                if(compChoice==3) System.out.println("Tied.");
            }
            case 4 -> System.out.println("Thank you for playing!");
        }

    }
}
