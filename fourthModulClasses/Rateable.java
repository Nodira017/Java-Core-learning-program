package fourthModulClasses;

@FunctionalInterface
public interface Rateable <T> {
    public static final Rating DEFAOULT_RATING = Rating.NONE_RATE;
    T applyRating (Rating rating);
    public default Rating getRating(){
        return DEFAOULT_RATING;
    }
    public default T applyRating(int stars){
        return applyRating(Rateable.convert(stars));
    }
    public static Rating convert(int stars){
        return (stars>=0 && stars<=5) ? Rating.values()[stars] : DEFAOULT_RATING;
    }
}
