package wrapper_dataTimeFormatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime thisTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(today);
        System.out.println(thisTime);
        System.out.println(currentDateTime);
        System.out.println();

        LocalDate someDate = LocalDate.of(2019, Month.APRIL, 1);
        LocalTime someTime = LocalTime.of(10,10);
        LocalDateTime someDT= someDate.atTime(someTime);
        LocalDate whatIsTheDate = someDT.toLocalDate();
        System.out.println(someDate.plusMonths(25));
        System.out.println(someDate);
        System.out.println(someTime);
        System.out.println(someDT);
        System.out.println(whatIsTheDate);
        System.out.println();

        LocalDateTime different = currentDateTime.withMinute(14).withDayOfMonth(3).plusHours(11);
        int year = currentDateTime.getYear();
        boolean after = currentDateTime.isAfter(different);
        System.out.println(different);
        System.out.println(year);
        System.out.println(after);


    }

}

