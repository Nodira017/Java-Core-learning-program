package fourthModulClasses;

public enum Rating {
    NONE_RATE("\u2606\u2606\u2606\u2606\u2606"),
    ONE_RATE("\u2605\u2606\u2606\u2606\u2606"),
    TWO_RATE("\u2605\u2605\u2606\u2606\u2606"),
    THREE_RATE("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_RATE("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_RATE("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    Rating(String stars){
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
