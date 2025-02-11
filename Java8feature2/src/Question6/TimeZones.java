package Question6;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
// for giving a better look to the date and time I used date formatter 'DateTimeFormatter'
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");

        ZonedDateTime indianTimeZone = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nyctime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTimes = ZonedDateTime.now(ZoneId.of("Europe/London"));
//taking three time zones as per the question
        System.out.println("IndianTimeZone: " + indianTimeZone.format(dateFormatter));
        System.out.println("Newyork times: " + nyctime.format(dateFormatter));
        System.out.println("London times: "+ londonTimes.format(dateFormatter));
    }
}
