package wrapper_dataTimeFormatting;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimall {
    public static void main(String[] args) {
        BigDecimal price=new BigDecimal("25.6");
        System.out.println("FirstPrice: "+ price);
        BigDecimal taxRate = new BigDecimal(12.8);
        System.out.println("TaxRate: "+ taxRate);
        BigDecimal tax= price.multiply(taxRate);
        System.out.println("Tax: " + tax);
        price=price.add(tax).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Current Price(rounded): " + price);
    }
}
