import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private ArrayList<Double> reviews;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.reviews = new ArrayList<>();
    }

    public void addReview(double review){
        if(review >= 0 && review <= 5){
            reviews.add(review);
        }
    }

    public void removeReview(double review){
        reviews.remove(review);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Double> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Double> reviews) {
        this.reviews = reviews;
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getReviews(), book.getReviews());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getReviews());
    }
}
