import java.util.Random;
import java.util.Scanner;
class guessTheNumber{
    int number;
    int guesses;
    public guessTheNumber(){        // constructor to set the random number and initialize no. of guesses
        Random R = new Random();
        number = R.nextInt(1,101);      // 1 is inclusive, 101 is exclusive: so range is 1 to 100
        guesses = 0;                    // initializing the number of guesses to 0
    }
    public int checkNumber(int n){
        guesses++;          // incrementing the number of guesses by 1 everytime a number is checked
        if(n>number){
            System.out.println("Lower number please.");
            return 0;
        }
        else if(n<number){
            System.out.println("Higher number please.");
            return 0;
        }
        else{
            System.out.println("Congrats! You got it in "+guesses+" attempts.");
            return 1;
        }
    }
}
public class _80_guess_the_number_oops_edition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guessTheNumber G = new guessTheNumber();
        int n;
        do{
            System.out.print("Enter your guess: ");
            n = sc.nextInt();
        }while(G.checkNumber(n)!=1);
    }
}
