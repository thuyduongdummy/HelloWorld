package OCA_SE8.Test5.Book;

public class Book {
    private String name;
    private String author;

    Book() {}

    Book(String name, String author) {
        name = name;
        author = author;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }
}
