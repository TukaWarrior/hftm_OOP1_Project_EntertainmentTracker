package hftm.lucabuetzberger;

public class Movie {

    //Fields
    private String movieTitle;
    private String movieDirector;
    private int movieReleaseYear;
    private String movieGenre;
    private int movieLength;
    private int movieRating;

    //Constructor
    public Movie() {
    }
    public Movie(String movieTitle, String movieDirector, int movieReleaseYear, String movieGenre, int movieLength, int movieRating) {
        this.movieTitle = movieTitle;
        this.movieDirector = movieDirector;
        this.movieReleaseYear = movieReleaseYear;
        this.movieGenre = movieGenre;
        this.movieLength = movieLength;
        this.movieRating = movieRating;
    }

    //Movie Title
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    //Movie Director
    public String getMovieDirector() {
        return movieDirector;
    }
    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    //Movie Release Year
    public Integer getMovieReleaseYear() {
        return movieReleaseYear;
    }
    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    //Movie Genre
    public String getMovieGenre() {
        return movieGenre;
    }
    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    //Movie Length
    public int getMovieLength() {
        return movieLength;
    }
    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    //Movie Rating
    public int getMovieRating() {
        return movieRating;
    }
    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public void showMovieAttributes() {
        System.out.println(movieTitle+" "+movieDirector+" "+movieReleaseYear+" "+movieGenre+" "+movieLength+" "+movieReleaseYear);
    }
}