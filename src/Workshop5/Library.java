package Workshop5;

import java.util.List;

public class Library {

    private List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}
