import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title, author;
    boolean available;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

public class LibraryManagementSystem {
    static List<Book> books = new ArrayList<>();

    public static void search(String keyword) {
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author + " | " + (b.available?"Available":"Checked out"));
            }
        }
    }

    public static void checkout(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) throw new BookNotAvailableException("Book already checked out!");
                b.available = false;
                System.out.println(title + " checked out successfully.");
                return;
            }
        }
        throw new BookNotAvailableException("Book not found!");
    }

    public static void main(String[] args) {
        books.add(new Book("Java Basics", "Author A"));
        books.add(new Book("Data Structures", "Author B"));
        search("java");
        try { checkout("Java Basics"); } catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
