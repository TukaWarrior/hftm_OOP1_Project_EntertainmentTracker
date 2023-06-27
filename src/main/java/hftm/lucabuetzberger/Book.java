package hftm.lucabuetzberger;

public class Book {

    //Fields
    private String bookTitle;
    private String bookAuthor;
    private int bookReleaseYear;
    private String bookGenre;
    private int bookPages;
    private int bookRating;

    //Constructor
    public Book(){
    }
    public Book(String bookTitle, String bookAuthor, int bookReleaseYear, String bookGenre, int bookPages, int bookRating){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookReleaseYear = bookReleaseYear;
        this.bookGenre = bookGenre;
        this.bookPages  =bookPages;
        this.bookRating = bookRating;
    }

    //Book Title
    public String getBookTitle(){
        return bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    //Book Author
    public String getBookAuthor(){
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    //Book ReleaseYear
    public int getBookReleaseYear(){
        return bookReleaseYear;
    }
    public void setBookReleaseYear(int bookReleaseYear){
        this.bookReleaseYear = bookReleaseYear;
    }

    //Book Genre
    public String getBookGenre(){
        return bookGenre;
    }
    public void setBookGenre(String bookGenre){
        this.bookGenre = bookGenre;
    }

    //Book Pages
    public int getBookPages(){
        return bookPages;
    }
    public void setBookPages(int bookPages){
        this.bookPages = bookPages;
    }

    //Book Rating
    public int getBookRating(){
        return bookRating;
    }
    public void setBookRating(int bookRating){
        this.bookRating = bookRating;
    }

    public void showBookAttributes() {
        System.out.println(bookTitle+" "+bookAuthor+" "+bookReleaseYear+" "+bookGenre+" "+bookPages+" "+bookRating);
    }
}