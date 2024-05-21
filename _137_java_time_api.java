// java.time package is capable of storing even nanoseconds. It's available from Java 8 onwards.

import java.time.LocalDate;         // LocalDate --> represents date
import java.time.LocalTime;         // LocalTime --> represents time
import java.time.LocalDateTime;     // LocalDateTime --> represents data + time

public class _137_java_time_api {
    public static void main(String[] args) {
        // Getting the current date using one of the classes from java.time package
        System.out.println(LocalDate.now());    // didn't even need to create an object
        // Getting the current time using one of the classes from java.time package
        System.out.println(LocalTime.now());    // didn't even need to create an object
        // Getting the current date + time using one of the classes from java.time package
        System.out.println(LocalDateTime.now());    // didn't even need to create an object
    }
}
