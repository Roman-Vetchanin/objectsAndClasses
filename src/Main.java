public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("К.", "Чуковский");
        System.out.println(firstAuthor.getFirstName() + firstAuthor.getSurname());
        Author sekondAuthor = new Author("Л.", "Толстой");
        Book firstBook = new Book("Корней Иванович Чуйковский", "Айболит", 1929);
        Book sekondBook = new Book("Лев Николаевич Толстой", "Война и мир", 1867);
        System.out.println("Название книги: " + firstBook.getBookTitle() + " автор: " + firstAuthor.getFirstName()+firstAuthor.getSurname() + " год публикации: " + firstBook.getYearOfPublication());
        System.out.println("Название книги: " + sekondBook.getBookTitle() + " автор: " + sekondAuthor.getFirstName()+sekondAuthor.getSurname() + " год публикации: " + sekondBook.getYearOfPublication());
        firstBook.setYearOfPublication(1930);
        System.out.println("Название книги: " + firstBook.getBookTitle() + " автор: " + firstAuthor.getFirstName()+firstAuthor.getSurname() + " год публикации: " + firstBook.getYearOfPublication());
    }
}