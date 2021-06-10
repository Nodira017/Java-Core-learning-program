package oop;

import java.math.BigDecimal;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager(Locale.UK);
        Product p2 = pm.createProduct(2, BigDecimal.valueOf(2.99), "Cake", Rating.ONE_RATE);


        p2 = pm.reviewProduct(p2, Rating.ONE_RATE, "Hello I'm M");
        p2 = pm.reviewProduct(p2, Rating.TWO_RATE, "Hello I'm Mennay");
        p2 = pm.reviewProduct(p2, Rating.THREE_RATE, "Hello I'm Mennay");
        p2 = pm.reviewProduct(p2, Rating.FOUR_RATE, "Hello I'm Mennay");
        p2 = pm.reviewProduct(p2, Rating.FIVE_RATE, "Hello I'm Mennay");

        pm.printProductReport();
    }
}
