import java.util.Scanner;

public class _25_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lacs per annum: ");
        float income = sc.nextFloat();
        float tax = 0.0f;
        if(income<=2.5){
            tax = tax + 0.0f;                   // no tax below income of 2.5 lacs
        }
        else if(income>2.5 && income<=5.0){
            tax = tax + (0.05f*(income-2.5f));  // above 2.5 and below 5.0, 5% on rest of income minus 2.5
        }
        else if(income>5.0 && income<=10.0){
            tax = tax + (0.05f*2.5f);           // above 5, 5% on 2.5 between 2.5-5.0 income
            tax = tax + (0.2f*(income-5.0f));   // and 20% on rest of income minus 5.0
        }
        else {
            tax = tax + (0.05f*2.5f);           // above 10.0, 5% on 2.5 between 2.5-5.0 income
            tax = tax + (0.2f*5.0f);            // 20% on 5.0 between 5.0-10.0 income
            tax = tax + (0.3f*(income-10.0f));  // and 30% on the rest of income above 10.0
        }
        System.out.println("The tax to be paid is: "+tax);
    }
}
