public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил Афанасьевич Булгаков");

        Author author1 = new Author("Михаил", "Афанасьевич", "Булгаков");
        Book book1 = new Book("Мастер и Маргарита", author1, 1937);
        book1.setPublicationYear(1938);

        Author author2 = new Author();
        author2.setFirstName("Михаил");
        author2.setMiddleName("Афанасьевич");
        author2.setLastName("Булгаков");
        Book book2 = new Book();
        book2.setName("Мастер и Маргарита");
        book2.setAuthor(author2);
        book2.setPublicationYear(1937);
    }
}
