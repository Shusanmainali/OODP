package workshop1;

public class Q11 {
    String title;
    String author;
    int year;

    public Q11(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

    public static void main(String[] args) {
        Q11 b = new Q11("Java Basics", "James", 2024);
        System.out.println(b);
    }
}
