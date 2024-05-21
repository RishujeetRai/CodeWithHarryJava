import java.util.Date;      // package to use Date class' methods

public class _134_date_class_in_java {
    public static void main(String[] args) {
        // Creating a Date class' instance
        Date D = new Date();
        System.out.println(D);      // will print the current Date and Time

        System.out.println(D.getTime());    // will print the no. of milliseconds that have passed since 1 Jan 1970

        System.out.println(D.getDate());    // will print the current date of the month : deprecated
        System.out.println(D.getDay());     // will print the day no. of the week : deprecated
        System.out.println(D.getSeconds()); // will print the current second of the minute : deprecated
        System.out.println(D.getMinutes()); // will print the current minute of the hour : deprecated
        System.out.println(D.getHours());   // will print the current hour of the day : deprecated
        System.out.println(D.getMonth());   // will print the current month of the year minus 1 : deprecated
        // 0 represents Jan, 1 represents Feb, and so on...
        System.out.println(D.getYear());    // will print the current year minus 1900 : deprecated
    }
}
