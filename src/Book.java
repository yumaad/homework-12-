import java.util.Objects;

public class Book {

    private final String title;
    private final Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year= year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Книга \"" + this.title + "\"," + author + ", год издания " + this.year;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
