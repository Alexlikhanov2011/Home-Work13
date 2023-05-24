
public class Book {
      private int year;
     private String name;
    private String author;


    public Book(String name, int year, String author) {
        this.year=year;
        this.name=name;
        this.author=author;
    }
    public String getName(){
        return this.name;
    }

    public int getYear() {
        return year;
    }
    public String getAuthor(){
        return author;
    }
    public void setYear(int year) {
        this.year=year;
    }
}
