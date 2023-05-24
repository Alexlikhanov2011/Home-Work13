public class Main {
    public static void main(String[] args) {
        System.out.println("Книга первая: ");
Book one = new Book("Анна Каренина", 1873);
Author surnameName = new Author("Лев", "Толстой");
       System.out.println("Название книги: " + one.getName());
       System.out.println("Год публикации книги: " + one.getYear());
        System.out.println("Имя писателя: " + surnameName.getName());
        System.out.println("Фамилия писателя: " + surnameName.getSurname());
        System.out.println();

        one.setYear(1874);
        System.out.println("Измененная дата публикации: " + one.getYear());

        System.out.println();

        System.out.println("Книга вторая: ");

        Book two = new Book("Идиот", 1867);
        Author surnameName2 = new Author("Федор", "Достоевский");

       System.out.println("Название книги: " + two.getName());
       System.out.println("Год публикации книги: " + two.getYear());
        System.out.println("Имя писателя: " + surnameName2.getName());
        System.out.println("Фамилия писателя: " + surnameName2.getSurname());

    }

}
