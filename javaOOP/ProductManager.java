package oop;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductManager {
    private Product product;
    private Review[] reviews = new Review[5];
    private ResourceBundle resources;
    private Locale locale;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    public ProductManager(Locale locale) {
        this.locale = locale;
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
        resources = ResourceBundle.getBundle("resources", Locale.UK);
    }

    public Product createProduct(int id, BigDecimal price, String name, Rating rating, LocalDate bestBefore) {
        product=new Food(id, price, name, rating, bestBefore);
        return product;
    }
    public Product createProduct(int id, BigDecimal price, String name, Rating rating) {
        product = new Drink(id, price, name, rating);
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comment) {
        if (reviews[reviews.length - 1] != null) {
            reviews = Arrays.copyOf(reviews, reviews.length + 5);
        }
        int sum = 0, i = 0, j=-1;
        boolean reviewed = false;
        OuterLoopLabel:
        while (!reviewed) {
            if (reviews[i] == null) {
                reviews[i] = new Review(rating, comment);
                reviewed = true;
                j=i;
            }
            sum += reviews[i].getRating().ordinal();
            if (i==j){
                break OuterLoopLabel;
            }
            i++;
        }
        this.product = product.applyRating(Rateable.convert(Math.round((float) (sum / (i+1)))));
//        System.out.println(this.product);
        return this.product;

    }

    public void printProductReport() {
        StringBuilder txt = new StringBuilder();
        if (product instanceof Food) {
            Food food = (Food) product;
            txt.append(MessageFormat.format(resources.getString("food"),
                    food.getName(),
                    moneyFormat.format(food.getPrice()),
                    food.getRating().getStars(),
                    food.getBestBefore().format(dateFormat.ofPattern("EEEE',' d 'of' MMMM yyyy", Locale.UK))));
        } else {
            txt.append(MessageFormat.format(resources.getString("product"),
                    product.getName(),
                    moneyFormat.format(product.getPrice()),
                    product.getRating().getStars()));
        }
        txt.append('\n');
        for (Review review : reviews) {
            if (review == null) break;
            txt.append(MessageFormat.format(resources.getString("review"),
                    review.getReview(),
                    review.getRating().getStars()));
            txt.append('\n');
        }
        if (reviews[0] == null) {
            txt.append("Not reviewed" + Rating.NONE_RATE.getStars());
        }
        System.out.println(txt);
    }
}
