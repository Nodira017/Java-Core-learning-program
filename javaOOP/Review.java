package oop;

public class Review {
    private Rating rating;
    private String comments;

    public Review(Rating rating, String review) {
        this.rating = rating;
        this.comments = review;
    }

    public Rating getRating() {
        return rating;
    }

    public String getReview() {
        return comments;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
