import java.util.Calendar;      // Calendar class is an abstract class, and thus we can't create its instance directly
// but, this class also has a static method that can be used to create this class' instance
import java.util.TimeZone;

public class _135_Calendar_class_in_java {
    public static void main(String[] args) {
        // getInstance() is a static method inside the Calendar class that can be used to create its instances
        Calendar C = Calendar.getInstance();    // creating Calendar class' instance

        // Using a few of Calendar class' methods
        System.out.println(C.getCalendarType());    // will print the type of the calendar this class uses
        System.out.println(C.getTimeZone());        // will print the time zone currently in use
        System.out.println(C.getTimeZone().getID());    // will print the ID of the time zone getting used
        System.out.println();

        // We can create an instance of Calendar class with a different timezone ID as well
        Calendar C1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(C1.getCalendarType());
        System.out.println(C1.getTimeZone());
        System.out.println(C1.getTimeZone().getID());
        System.out.println();

        // Getting the current year, month, date, hour, minute, second, etc. using the Calendar class
        System.out.println(C.get(Calendar.YEAR));       // prints the current year
        System.out.println(C.get(Calendar.MONTH));      // prints the current month minus 1
        // 0 is Jan, 1 is Feb, and so on...
        System.out.println(C.get(Calendar.WEEK_OF_MONTH));  // prints the week no. of the month
        System.out.println(C.get(Calendar.WEEK_OF_YEAR));   // prints the week no. of the year
        System.out.println(C.get(Calendar.DATE));           // prints the current date
        System.out.println(C.get(Calendar.DAY_OF_MONTH));   // prints the day no. of the month
        System.out.println(C.get(Calendar.DAY_OF_WEEK));    // prints the day no. of the week
        System.out.println(C.get(Calendar.DAY_OF_YEAR));    // prints the day no. of the year
        System.out.println(C.get(Calendar.HOUR));           // prints the hour of the day in 12 hours format
        System.out.println(C.get(Calendar.HOUR_OF_DAY));    // prints the hour of the day in 24 hours format
        System.out.println(C.get(Calendar.MINUTE));         // prints the minute if the hour
        System.out.println(C.get(Calendar.SECOND));         // prints the second of the minute
    }
}
