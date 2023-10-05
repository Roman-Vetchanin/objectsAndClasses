public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("К.", "Чуковский");
        System.out.println(firstAuthor.toString());
        Author sekondAuthor = new Author("Л.", "Толстой");
        Book firstBook = new Book(firstAuthor, "Айболит", 1929);
        Book sekondBook = new Book(sekondAuthor, "Война и мир", 1867);
        System.out.println("Название книги: " + firstBook.toString() + " автор: " + firstBook.getAuthor() + " год публикации: " + firstBook.getYearOfPublication());
        System.out.println("Название книги: " + sekondBook.toString() + " автор: " + sekondBook.getAuthor() + " год публикации: " + sekondBook.getYearOfPublication());
        firstBook.setYearOfPublication(1930);
        System.out.println("Название книги: " + firstBook.toString() + " автор: " + firstBook.getAuthor() + " год публикации: " + firstBook.getYearOfPublication());

        Author c1 = new Author("К.", "Чуковский");
        System.out.println(c1.equals(firstAuthor));
        Book c2 = new Book(sekondAuthor, "Война и мир", 1867);
        boolean c3 = c2.hashCode() == sekondBook.hashCode();
        System.out.println(c3);
    }
}