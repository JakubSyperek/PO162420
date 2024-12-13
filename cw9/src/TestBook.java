
public class TestBook {
    public static void main(String[] args){
        Book book = new Book("Lalka", "Bolesław Prus");
        book.addReview(4.6);
        book.addReview(4.2);
        book.addReview(3.8);
        System.out.println(book);
        book.removeReview(3.8);
        System.out.println(book);

        FantasyBook fantasyBook = new FantasyBook("Władca pierścieni", "J. R. R. Tolkien", "fantastyka");
        fantasyBook.addReview(4.7);
        fantasyBook.addReview(4.3);
        fantasyBook.addReview(4.8);
        System.out.println(fantasyBook);

        FantasyBook fantasyBook2 = new FantasyBook("Władca pierścieni", "J. R. R. Tolkien", "fantastyka");
        fantasyBook2.addReview(4.7);
        fantasyBook2.addReview(4.3);
        fantasyBook2.addReview(4.8);

        System.out.println("Equals: " + fantasyBook.equals(fantasyBook2));
        System.out.println("HashCode 1: " + book.hashCode());
        System.out.println("HashCode 2: " + fantasyBook.hashCode());
        System.out.println("HashCode 3: " + fantasyBook2.hashCode());


    }
}
