package wrapper_dataTimeFormatting;

import java.math.BigDecimal;
import java.time.*;

public class InstanceDuritionPeriod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate foolsDay = LocalDate.of(2019, Month.APRIL, 1);
        Instant timeStamp = Instant.now();
        System.out.println(foolsDay);
        System.out.println(timeStamp);

        int nanoSecondFromLastSecond = timeStamp.getNano();
        Period howLong = Period.between(foolsDay, today);
        Duration twoHours = Duration.ofHours(2);
        long seconds = twoHours.minusMinutes(15).getSeconds();
        int days = howLong.getDays();
        int year = howLong.getYears();
        int month = howLong.getMonths();

        System.out.println(nanoSecondFromLastSecond);
        System.out.println(howLong);
        System.out.println(twoHours);
        System.out.println(seconds);
        System.out.println(days);
        System.out.println(month);
        System.out.println(year);

        LocalDate first = LocalDate.of(2021, Month.JANUARY, 1);
        Instant todayy = Instant.now();
        Instant thisday = Instant.parse("2021-03-13T06:02:14.636Z");
        Instant firstdayofyear = Instant.parse("2021-01-01T01:00:10.636Z");
        Duration duration = Duration.between(firstdayofyear, thisday);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        BigDecimal day = new BigDecimal(duration.getSeconds()/86400);
        System.out.println(day.setScale(0, BigDecimal.ROUND_DOWN));



    }
}
