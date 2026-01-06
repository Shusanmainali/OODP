package Workshop5;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        Book b1 = new Book("Java");
        Book b2 = new Book("Python");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        Library library = new Library(books);
        library.showBooks();

        library = null;
        System.out.println(b1.title); // Book still exists
    }
}

