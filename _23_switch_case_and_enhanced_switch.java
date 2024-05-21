public class _23_switch_case_and_enhanced_switch {
    public static void main(String[] args) {
        int var = 4;
//        // Syntax for switch case statement in Java
//        switch (var){       // var can be int, char or String in Java
//            case 1:
//                System.out.println("Var has value 1.");
//                break;
//            case 2:
//                System.out.println("Var has value 2.");
//                break;
//            case 3:
//                System.out.println("Var has value 3.");
//                break;
//            case 4:
//                System.out.println("Var has value 4.");
//                break;
//            default:        // break isn't required for default case, though you can still put it in
//                System.out.println("Var is neither of 1, 2, 3 or 4.");
//        }

        // Syntax for enhanced switch in Java (doesn't require a break statement)
        // (and you need curly braces if you write more than one statement in a case)
        switch (var) {      // this is syntax for enhanced switch in Java, which doesn't require break statement
            case 1 -> System.out.println("Var has value 1.");
            case 2 -> System.out.println("Var has value 2.");
            case 3 -> System.out.println("Var has value 3.");
            case 4 -> System.out.println("Var has value 4.");
            default -> System.out.println("None of values 1, 2, 3 or 4 encountered.");
        }
        // Syntax to check a char value as condition for switch case
        char c = 'b';
        switch (c) {
            case 'a' -> System.out.println("char has value a.");
            case 'b' -> System.out.println("char has value b.");
            case 'c' -> System.out.println("char has value c.");
            case 'd' -> System.out.println("char has value d.");
            default -> System.out.println("None of values a, b, c, or d encountered.");
        }
        // Syntax to check a string value as condition for switch case
        String s = "Rishu";
        switch (s) {
            case "Harry" -> {
                System.out.println("Hello Harry");
                System.out.println("Nice playlist.");
            }
            case "Rishu" -> {
                System.out.println("Hello Rishu");
                System.out.println("Happy coding.");
            }
            case "Rocky Bhai" -> {
                System.out.println("Salaam Rocky Bhai.");
            }
            case "Endeavor" -> {
                System.out.println("Hello Endeavor");
                System.out.println("Go to hell.");
            }
            default -> {
                System.out.println("Ja na.");
            }
        }
/*
        The Java switch statement only works with:

        Primitive data types: byte, short, char, and int
        Enumerated types
        String Class
        Wrapper Classes: Character, Byte, Short, and Integer.
*/
    }
}
