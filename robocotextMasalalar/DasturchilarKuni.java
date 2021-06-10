package robocotextMasalalar;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DasturchilarKuni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("yilni kiriting:");
        short yil=sc.nextShort();
        if(yil<9999&&yil>0){
            LocalDate date =  LocalDate.of(yil, Month.JANUARY, 1);
            date = date.plusDays(255);
            DateTimeFormatter format = DateTimeFormatter.ofPattern("d'/'MM'/'yyyy", new Locale("en"));
            System.out.println(date.format(format));
        }
        else
            System.out.println("year is between (1, 9999)");
    }
}
