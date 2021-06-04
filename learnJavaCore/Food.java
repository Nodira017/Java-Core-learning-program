package fourthModulClasses;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public final class Food extends Product {
    private LocalDate bestBefore;

    public Food(int id, BigDecimal price, String name, Rating rating, LocalDate bestBefore) {
        super(id, price, name, rating);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Food(this.getId(), this.getPrice(), this.getName(), newRating, this.getBestBefore());
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bestBefore;
    }

//    @Override
//    public Product applyProduct(Rating newRate) {
//        return new Food(getId(), getPrice(), getName(), newRate,bestBefore);
//    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.equals(LocalDate.now()))?super.getDiscount():BigDecimal.ONE;
    }
}
