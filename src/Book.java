
public class Book {
      private int year;
     private String name;

    public Book(String name, int year) {
        this.year=year;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year=year;
    }
}
