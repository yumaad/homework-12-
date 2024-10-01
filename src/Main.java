public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Куприн");
        Author author2 = new Author("Александр", "Куприн");

        Book book1 = new Book("Гранатовый браслет", author1, 1911);
        Book book2 = new Book("Яма", author2, 2000);

        // Изменяем год публикации одной из книг
        book1.setYear(2022);

        System.out.println(book1);
        System.out.println(book2.hashCode());
        System.out.println(book1.hashCode());

        if (book1.equals(book2))
            System.out.println("Книги одинаковы");
        else {
            System.out.println("Книги разные");
        }

        if (author1.equals(author2))
            System.out.println("Автор один и тот же");
        else {
            System.out.println("Авторы разные");
        }
    }
}