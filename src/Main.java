public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Анна Каренина", 1873, author);
        System.out.println("Название книги: " + book.getName());
        System.out.println("Год публикации книги: " + book.getYear());
        System.out.println("Имя фамилия писателя: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println();
        book.setYear(1874);
        System.out.println("Измененная дата публикации: " + book.getYear());

        System.out.println();

        System.out.println("Книга вторая: ");
        Author author1 = new Author("Федор", "Достоевский");
        Book two = new Book("Идиот", 1867, author1);


        System.out.println("Название книги: " + two.getName());
        System.out.println("Год публикации книги: " + two.getYear());
        System.out.println("Имя фамилия писателя: " +two.getAuthor().getName() + " " + two.getAuthor().getSurname());

    }
}
