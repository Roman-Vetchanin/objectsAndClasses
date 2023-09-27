public class Book {
    private String author;
    private String bookTitle;
    private int yearOfPublication;
    public Book(String author, String bookTitle, int yearOfPublication){
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }
    public String getAuthor(){
        return this.author;
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
