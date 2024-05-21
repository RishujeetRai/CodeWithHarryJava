import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
public class _140_format_time {
    public static void main(String[] args) {
        // using Date class
        Date D = new Date();
        System.out.println(D.getHours()+":"+D.getMinutes()+":"+D.getSeconds());
        // using Calendar class
        Calendar C = Calendar.getInstance();
        System.out.println(C.get(Calendar.HOUR_OF_DAY)+":"+C.get(Calendar.MINUTE)+":"+C.get(Calendar.SECOND));
        // using Time API
        LocalDateTime DT = LocalDateTime.now();
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("H:m:s");
        String time = DT.format(DF);
        System.out.println(time);
    }
}
