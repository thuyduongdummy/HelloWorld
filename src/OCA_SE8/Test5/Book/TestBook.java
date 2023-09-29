package OCA_SE8.Test5.Book;

public class TestBook {
    public static void main(String[] args) {
         Book book = new Book("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
