public class Book {
    private final Author author;
    private String bookTitle;
    private int yearOfPublication;
    public Book(Author author, String bookTitle, int yearOfPublication){
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }
    public String getAuthor(){
        return author.getFirstName()+author.getSurname();
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication (int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
