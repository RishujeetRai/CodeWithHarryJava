import java.util.Scanner;
public class _19_replaces_spaces_with_underscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line to replace its spaces with underscores:");
        String s = sc.nextLine();
        s = s.replace(' ','_');     // note: we didn't edit the original string, but rather reassigned s
        System.out.println(s);
    }
}
