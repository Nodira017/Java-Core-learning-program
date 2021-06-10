package wrapper_dataTimeFormatting;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class LanguageAndCountryFormatNumericValues {
    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    private Locale locale ;
        private BigDecimal price;
        private double rate;

    public LanguageAndCountryFormatNumericValues(BigDecimal price, double rate, Locale locale) {
        this.price = price;
        this.rate = rate;
        this.locale= locale;
    }

    public String  getPrice() {
        NumberFormat currentFormat = NumberFormat.getCurrencyInstance(locale);
        return currentFormat.format(price);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String  getRate() {
        NumberFormat percentFormat = NumberFormat.getCurrencyInstance(locale);
        return percentFormat.format(rate);
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static void main(String[] args) {
        Locale uk = new Locale("en" , "GB");
        Locale ukk = new Locale("en", "GB", "EURO");
        Locale fr = new Locale("fr", "CA");
        Locale current = Locale.getDefault();
        System.out.println(uk);
        System.out.println(ukk);
        System.out.println(fr);
        System.out.println(current);
        Locale th = Locale.forLanguageTag("th-TH--u-ca-buddhist-nu-thai");
        System.out.println(th);
        System.out.println();

        //FORMAT AND PARSE NUMERIC VALUES
        BigDecimal price = BigDecimal.valueOf(2.99);
        double tax = 0.2;
        int quantity = 12345;
        Locale locale = new Locale("ru","RU");
        NumberFormat currentFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currentFormat);
        NumberFormat persentageFormat = NumberFormat.getPercentInstance(locale);
        System.out.println(persentageFormat);
        NumberFormat numberFOrmat = NumberFormat.getNumberInstance(locale);
        System.out.println(numberFOrmat.getMaximumFractionDigits());
        System.out.println(numberFOrmat);
        String formatPrice = currentFormat.format(price);
        String formattedTax = persentageFormat.format(tax);
        String formattedQuentity = numberFOrmat.format(quantity);
        System.out.println(formatPrice);
        System.out.println(formattedTax);
        System.out.println(formattedQuentity);
    }
}
