package fourthModulClasses;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public final class Drink extends Product{
    public Drink(int id, BigDecimal price, String name, Rating rating) {
        super(id, price, name, rating);
    }

//    @Override
//    public Product applyProduct(Rating newRate) {
//        return new Drink(getId(), getPrice(), getName(), newRate);
//    }

    @Override
    public BigDecimal getDiscount() {
        return (LocalTime.now().isAfter(LocalTime.of(17, 30)) && LocalTime.now().isBefore(LocalTime.of(18, 30)))
                ?super.getDiscount():BigDecimal.ZERO;
    }


    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(this.getId(), this.getPrice(), this.getName(), newRating);

    }
}
