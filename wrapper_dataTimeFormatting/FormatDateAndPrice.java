package wrapper_dataTimeFormatting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDateAndPrice {
    private Locale locale;
        private LocalDateTime dateTime;

    public String  getDateTime() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EE ',' d 'of' MMMM yyyy 'at' HH:mm", locale);
        return dateTime.format(format);
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    FormatDateAndPrice(LocalDateTime dateTime, Locale locale) {
        this.dateTime = dateTime;
        this.locale = locale;

    }

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        Locale locale = new Locale("en", "GB");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EE ',' d 'of' MMMM yyyy 'at' HH:mm", locale);
        String result = date.format(format);
        System.out.println(result);
//        date = LocalDate.parse("Tuesday 23 04 2019", format);
        // parse formatlangan date ni orqaga qaytaradi
        System.out.println(date);
        locale = new Locale("ru");
        format = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale);
        result = date.format(format);
        System.out.println(result);

    }
}
