public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Алесандр", "Куприн");
        Author author2 = new Author("Иван", "Гончаров");

        Book book1 = new Book("Гранатовый браслет", author1, 1911);
        Book book2 = new Book("Обломов", author2, 2000);

        // Изменяем год публикации одной из книг
        book1.setYear(2022);

        System.out.println("\"" + book1.getTitle() + "\" " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + " " + book1.getYear() + "г.");
        System.out.println("\"" + book2.getTitle() + "\" " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname() + " " + book2.getYear() + "г.");
    }
}