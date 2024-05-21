import java.util.GregorianCalendar;     // this class is used to create an instance of Gregorian Calendar
// we can change the year, month and date using different set methods of this class
import java.util.TimeZone;      // TimeZone class is used to create Time Zones in Java
// this class is abstract and cannot be instantiated

public class _136_GregorianCalendar_and_TimeZone_in_java {
    public static void main(String[] args) {
        GregorianCalendar G = new GregorianCalendar();  // creating an instance of GregorianCalendar
        // method from GregorianCalendar class to check whether a year is leap or not
        // will print true if a year is a leap year, otherwise false if a year is not a leap year
        System.out.println(G.isLeapYear(1900));     // will print false since 1900 was not a leap year
        System.out.println(G.isLeapYear(2000));     // will print true since 2000 was a leap year
        System.out.println(G.isLeapYear(2019));     // will print false since 2019 was not a leap year

        // some methods of the TimeZone class
        // getAvailableIDs() method to get available timezone IDs
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);      // and so on...
        // getDefault() method to get the default timezone
        System.out.println(TimeZone.getDefault());
        // getID() method to get the ID of a timezone
        System.out.println(G.getTimeZone().getID());
    }
}
