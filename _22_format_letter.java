public class _22_format_letter {
    public static void main(String[] args) {
        String letter = "Dear Harry, long time no see. Thanks.";
        System.out.println("Before formatting, the letter is:");
        System.out.println(letter);
        String letter2 = "Dear Harry,\n\t\tlong time no see.\n\t\t\t\t  Thanks.";
        System.out.println("After formatting, the letter is:");
        System.out.println(letter2);
    }
}
