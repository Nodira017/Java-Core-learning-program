package oop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Product implements Rateable<Product> {
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private BigDecimal price;
    private String name;
    private Rating rating;

    Product(int id, BigDecimal price, String name, Rating rating) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.rating = rating;
    }

    Product(int id, BigDecimal price, String name) {
        this(id, price, name, Rating.NONE_RATE);
    }
    @Override
    public Rating getRating() {
        return rating;
    }

    public static BigDecimal getDiscountRate() {
        return DISCOUNT_RATE;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public  BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(getClass()==o.getClass()&& o!=null){
            final Product other = (Product)o;
            return this.id==other.id && this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 35 * result + (price != null ? price.hashCode() : 2);
        result = 31 * result + (name != null ? name.hashCode() : 4);
        result = 31 * result + (rating != null ? rating.hashCode() : 60);
        return result;
    }

    @Override
    public String toString() {
        return id + ", " + price + ", " + name +  ", "+ getDiscount() +", " + rating.getStars() ;
    }
}
