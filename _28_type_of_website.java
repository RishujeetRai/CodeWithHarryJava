import java.util.Scanner;
public class _28_type_of_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url for website:");
        String s = sc.nextLine();
        if(s.endsWith(".com")) System.out.println("It's a commercial website.");
        else if(s.endsWith(".org")) System.out.println("It's an organisation website.");
        else if(s.endsWith(".in")) System.out.println("It's an Indian website.");
        else System.out.println("Not in directory.");
    }
}
