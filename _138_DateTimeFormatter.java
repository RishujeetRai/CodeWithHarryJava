import java.time.LocalDateTime;     // to get current date and time
import java.time.format.DateTimeFormatter;
// DateTimeFormatter --> Formatter for displaying and parsing date-time objects

public class _138_DateTimeFormatter {
    public static void main(String[] args) {
        // Creating a date-time format of our choice and getting the current date and time in that format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");   // creating formatter
        LocalDateTime dateTime = LocalDateTime.now();   // getting current date-time
        String myDate = dateTime.format(df);    // formatting the date-time we got
        System.out.println(myDate);     // printing the formatted date-time

        // Using inbuilt formats of the DateTimeFormatter
        DateTimeFormatter DF = DateTimeFormatter.ISO_LOCAL_DATE;
        myDate = dateTime.format(DF);
        System.out.println(myDate);

        // Getting the time, am/pm of the day and the day of the week
        DateTimeFormatter DF2 = DateTimeFormatter.ofPattern("HH:mm a, EEEE");
        myDate = dateTime.format(DF2);
        System.out.println(myDate);

        // Many more formats in the DateTimeFormatter, refer to Java 14 docs to know them

        // Experimenting with the date time formatter
        DateTimeFormatter df2;  // creating object
        /* Digits */
//        df2 = DateTimeFormatter.ofPattern("MM,yyyy");     // 08,2022
//        df2 = DateTimeFormatter.ofPattern("M,yy");        // 8,22 (if month is 10, 11 or 12 then 10,22)
//        df2 = DateTimeFormatter.ofPattern("MM,y");        // 08,2022
//        df2 = DateTimeFormatter.ofPattern("MM,yyy");      // 08,2022
//        df2 = DateTimeFormatter.ofPattern("d,MM,yy");     // 31,08,22 (if date is 1,2,3 etc. then 1,08,22)
        /* Letters */
//        df2 = DateTimeFormatter.ofPattern("MMMM,yy");     // August,22
//        df2 = DateTimeFormatter.ofPattern("MMM,yyyy");     // Aug,2022
        df2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");  // 31-August-2022
        /* Errors */
//        df2 = DateTimeFormatter.ofPattern("ddd,MMMM,yy");         // more than two d causes error
//        df2 = DateTimeFormatter.ofPattern("ddd,MMMMM,yy");        // more than four M causes error
//        df2 = DateTimeFormatter.ofPattern("ddd,MMMM,yyyyy");      // more than four y causes error

        LocalDateTime dateTime2 = LocalDateTime.now();   // getting current date-time
        String myDate2 = dateTime2.format(df2);    // formatting the date-time we have
        System.out.println(myDate2);     // printing the formatted date-time

        /*
            SUMMARY:
            yy returns year in two digits
            y , yyy, yyyy return year in four digits
            d returns date in single-digit, if date is double-digit itself, it's returned as it is
            dd returns the date in double-digit, if date is single-digit, it's returned with a 0 in front
            MM returns the month in double-digit, if month is single-digit, it's returned with a 0 in front
            M returns the month in single-digit, if month is double-digit itself, it's returned as it is
            MMM returns the month in three letter format, example: Aug, Mar, Jul, Dec etc.
            MMMM returns the month in its full english name, example: August, March, July, December etc.
            More than 2 d's or 4 M's or 4 y's causes error
        */
    }
}
