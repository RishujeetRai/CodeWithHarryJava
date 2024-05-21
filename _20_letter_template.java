import java.util.Scanner;
public class _20_letter_template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The letter template is as follows: ");
        String l = "Dear <|name|>, thanks a lot.";
        System.out.println(l);
        System.out.println("Enter name to place in the letter:");
        String name = sc.nextLine();
        System.out.println(l.replace("<|name|>",name));
    }
}
