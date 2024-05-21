import java.util.Locale;

public class _17_string_methods {
    public static void main(String[] args) {
        // strings are immutable in java
        // that means, string methods don't edit the original string
        // but rather, they usually return a new string (return type depends on the method called)
        String name = "Rocky Bhai";
        System.out.println(name);
        int len = name.length();
        System.out.println("The length of "+name+" is "+len);
        String lc = name.toLowerCase();
        System.out.println("The name in lowercase is: "+lc);
        String uc = name.toUpperCase();
        System.out.println("The name in uppercase is: "+uc);

        String nonTrimmed = "     hihihihihi       ";
        String trimmed = nonTrimmed.trim();
        // trim() method returns a string after removing all the leading and trailing spaces from the original string
        System.out.println("The trimmed string is: "+trimmed);

        String sub1 = name.substring(4);
        // substring(int start) method returns a string starting from the entered index of the original string
        System.out.println("The substring is: "+sub1);
        String sub2 = name.substring(4,7);
        // substring(int start, int end) method returns a string
        // from the entered starting index till before the entered ending index of the original string
        // char at starting index is included while char at ending index is excluded
        // why the char at ending index is excluded? It's to provide '\0', a null character.
        // index starts from 0 but ends at string.length(), that one extra char is '\0'
        // compiler throws error if you enter a starting index less than 0,
        // or an ending index greater than string.length(),
        // or if starting index is greater than ending index, or vice-versa
        System.out.println("The substring is: "+sub2);

        String rs1 = name.replace('R','H');
        // replace() method returns a new string after replacing all instances of old char with new char in org string
        // doesn't throw error if old char mentioned is not present in the original string
        System.out.println("After replacement of R with H, the name becomes: "+rs1);
        String rs2 = name.replace("Rocky","Rishu");
        // replace() method also replaces a string of old chars with a string of new chars as well
        // for all instances of string of old chars
        System.out.println("After replacement of Rocky with Rishu, the name becomes: "+rs2);

        boolean a = name.startsWith("Ro");
        boolean b = name.startsWith("Ho");
        // startsWith() method returns true or false if the org string starts with the mentioned string or not
        System.out.println("The name starts with Ro: "+a);
        System.out.println("The name starts with Ho: "+b);

        boolean c = name.endsWith("ai");
        boolean d = name.startsWith("oi");
        // endsWith() method returns true or false if the org string ends with the mentioned string or not
        System.out.println("The name ends with ai: "+c);
        System.out.println("The name ends with oi: "+d);

        char ch = name.charAt(2);
        // charAt() method returns the character at provided index of the original string
        System.out.println("The character at provided index of the original string is: "+ch);

        int i1 = name.indexOf('o');
        // indexOf() method returns index of first occurrence of mentioned char from the original string
        // returns -1 in case the mentioned char is not present in the original string
        System.out.println("Index of char 'o' in original string is: "+i1);
        int i2 = name.indexOf("oc");
        // indexOf() is also used to get the starting index of the 1st occurrence of mentioned string from the org string
        // again returns -1 in case the mentioned string is not present in the original string
        System.out.println("The starting index of string oc in original string is: "+i2);
        int i3 = name.indexOf('o',3);
        // we can mention a starting index in indexOf() method as well
        // in which case, it starts searching from that index of the original string
        // again returns -1 in case the mentioned char is not present after the mentioned index in the org string
        System.out.println("The index of char o after index 3 is: "+i3);
        int i4 = name.indexOf("Rocky", 2);
        // same for string again
        // returns starting index of first occurrence of mentioned string from the original string
        // again returns -1 in case the mentioned string is not found after the mentioned index in the org string
        System.out.println("The starting index of string Rocky after index 2 is: "+i4);

        int i5 = name.lastIndexOf('o');
        // lastIndexOf() method returns index of last occurrence of mentioned char from the original string
        // returns -1 in case the mentioned char is not present in the original string
        System.out.println("Last index of last char 'o' in original string is: "+i5);
        int i6 = name.lastIndexOf("oc");
        // lastIndexOf() is also used to get the starting index of the last occurrence of mntnd str from the org str
        // again returns -1 in case the mentioned string is not present in the original string
        System.out.println("The starting index of last string oc in original string is: "+i6);
        int i7 = name.lastIndexOf('o',3);
        // we can mention an ending index in lastIndexOf() method as well
        // in which case, it ends searching after reaching that index of the original string
        // again returns -1 in case the mentioned char is not present before the mentioned index in the org string
        System.out.println("The index of last char o before index 3 is: "+i7);
        int i8 = name.lastIndexOf("Rocky", 2);
        // same for string again
        // returns starting index of last occurrence of mentioned string from the original string
        // again returns -1 in case the mentioned string is not found before reaching the mntnd index in the org str
        System.out.println("The starting index of last string Rocky before index 2 is: "+i8);

        boolean e = name.equals("Rocky Bhai");
        // equals() checks if original string is same as mentioned string or not, and returns a boolean value
        // returns true if org str is same as mentioned str, otherwise false
        System.out.println("The original string is same as Rocky Bhai: "+e);
        boolean f = name.equalsIgnoreCase("rocky bhai");
        // equalsIgnoreCase() is same as equals() method
        // except it ignores the differences in upper or lower cases of the org str and the mentioned str
        System.out.println("The original string is same as rocky bhai if we ignore the difference in cases: "+f);
    }
}
