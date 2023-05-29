
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
}
