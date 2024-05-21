/*
 java.time --> package for Date and Time in Java (from Java 8 onwards)

 Before Java 8, java.util package used to hold the data and time classes. Now these classes are deprecated.

 Data in Java is stored in the form of a long number.
 This long number holds the number of milliseconds passed since 1 Jan 1970.

 Java assumes that year 1900 is the start year which means it calculates years passed since 1900 whenever
 we ask it for years passed.
*/

public class _133_date_and_time_in_java {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());     // returns no. of milliseconds passed since 1 Jan 1970

        // Printing no. of years, months, days, minutes and seconds passed since 1 Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/30/12);  // will print years passed since
        System.out.println(System.currentTimeMillis()/1000/3600/24/30);     // will print months passed since
        System.out.println(System.currentTimeMillis()/1000/3600/24);        // will print days passed since
        System.out.println(System.currentTimeMillis()/1000/3600);           // will print hours passed since
        System.out.println(System.currentTimeMillis()/1000);                // will print seconds passed since
    }
}
