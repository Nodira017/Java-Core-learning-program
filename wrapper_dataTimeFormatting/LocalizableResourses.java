package wrapper_dataTimeFormatting;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizableResourses {
    public static void main(String[] args){

        Locale locale = Locale.UK;
        ResourceBundle rb = ResourceBundle.getBundle("prop");
        System.out.println(rb.getString("hello"));
        String offerPatern = rb.getString("offer");
        StringBuilderr name = new StringBuilderr("tea");
        LanguageAndCountryFormatNumericValues priceAndRate = new LanguageAndCountryFormatNumericValues(new BigDecimal(3021), 30, new Locale("en"));
        FormatDateAndPrice date = new FormatDateAndPrice(LocalDateTime.now(), new Locale("en"));
        String formatted = MessageFormat.format(offerPatern, name.getName(), priceAndRate.getPrice(), priceAndRate.getRate(), date.getDateTime());
        System.out.println(formatted);

        priceAndRate.setLocale(new Locale("ru"));
        date.setLocale(new Locale("ru"));
        ResourceBundle rurb = ResourceBundle.getBundle("prop",new Locale("ru"));
        String ruoffer=rurb.getString("offer");
        System.out.println(MessageFormat.format(ruoffer,name.getName(), priceAndRate.getPrice(), priceAndRate.getRate(), date.getDateTime()));
    }
}
