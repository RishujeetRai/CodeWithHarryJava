import java.util.Scanner;
public class _21_has_double_and_triple_spaces_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with double or triple spaces:");
        String s = sc.nextLine();
        int ds = s.indexOf("  "), ts = s.indexOf("   ");
        if(ds==-1) {    // if not double spaces, then no triple spaces either
            System.out.println("Entered string has neither double nor triple spaces.");
        }
        else if (ts==-1) {  // condition only true if there are double spaces, but no triple spaces
            System.out.println("Entered string has double spaces.");
        }
        else {      // condition only true when ds==-1 and ts==-1 fails
            System.out.println("Entered string has both double and triple spaces.");
        }
    }
}
