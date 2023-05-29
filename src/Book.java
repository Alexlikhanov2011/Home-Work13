import java.util.Objects;
public class Book {
    private Author author;
      private int year;
     private String name;



    public Book(String name, int year, Author author) {
        this.year=year;
        this.name=name;
        this.author=author;

    }

    public String getName(){
        return this.name;
    }
public Author getAuthor(){
        return author;
}
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year&& Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
    @Override
    public String toString() {
        return "Название книги: " + this.name + ", выпущена: " + this.year + ". Автор книги: " + this.author.toString();
    }
}