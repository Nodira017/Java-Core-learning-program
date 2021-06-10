package wrapper_dataTimeFormatting;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateAndTime {
    public static void main(String[] args) {
        ZoneId london = ZoneId.of("Europe/London");
        System.out.println(london);
        LocalDateTime sometime = LocalDateTime.of(2019, Month.FEBRUARY, 1 , 07, 30);
        ZonedDateTime londontime = ZonedDateTime.of(sometime, london);
        System.out.println(londontime);
        ZonedDateTime laTime = londontime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(laTime);

    }
}
