package hftm.lucabuetzberger;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class PrimaryController {

    //Fields Books
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> bookTitleColumn;
    @FXML
    private TableColumn<Book, String> bookAuthorColumn;
    @FXML
    private TableColumn<Book, Integer> bookReleaseYearColumn;
    @FXML
    private TableColumn<Book, String> bookGenreColumn;
    @FXML
    private TableColumn<Book, Integer> bookPagesColumn;
    @FXML
    private TableColumn<Book, Integer> bookRatingColumn;

    //Fields Movie
    @FXML
    private TableView<Movie> movieTable;
    @FXML
    private TableColumn<Movie, String> movieTitleColumn;
    @FXML
    private TableColumn<Movie, String> movieDirectorColumn;
    @FXML
    private TableColumn<Movie, Integer> movieReleaseYearColumn;
    @FXML
    private TableColumn<Movie, String> movieGenreColumn;
    @FXML
    private TableColumn<Movie, Integer> movieLengthColumn;
    @FXML
    private TableColumn<Movie, Integer> movieRatingColumn;

    //Fields Game
    @FXML
    private TableView<Game> gameTable;
    @FXML
    private TableColumn<Game, String> gameTitleColumn;
    @FXML
    private TableColumn<Game, String> gameDeveloperColumn;
    @FXML
    private TableColumn<Game, Integer> gameReleaseYearColumn;
    @FXML
    private TableColumn<Game, String> gameGenreColumn;
    @FXML
    private TableColumn<Game, Integer> gamePlaytimeColumn;
    @FXML
    private TableColumn<Game, Integer> gameRatingColumn;

    //Fields TVShow
    @FXML
    private TableView<TVShow> tvshowTable;
    @FXML
    private TableColumn<TVShow, String> tvshowTitleColumn;
    @FXML
    private TableColumn<TVShow, String> tvshowDirectorColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowReleaseYearColumn;
    @FXML
    private TableColumn<TVShow, String> tvshowGenreColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowEpisodesColumn;
    @FXML
    private TableColumn<TVShow, Integer> tvshowRatingColumn;

    @FXML
    public void initialize() {

        //Initializes the book table and columns
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitleProperty());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorProperty());
        this.bookReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().bookReleaseYearProperty().asObject());
        this.bookGenreColumn.setCellValueFactory(cellData -> cellData.getValue().bookGenreProperty());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesProperty().asObject());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingProperty().asObject());
        this.bookTable.setItems(App.getBookList());

        //Initializes the movie table and columns
        this.movieTitleColumn.setCellValueFactory(cellData -> cellData.getValue().movieTitleProperty());
        this.movieDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().movieDirectorProperty());
        this.movieReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().movieReleaseYearProperty().asObject());
        this.movieGenreColumn.setCellValueFactory(cellData -> cellData.getValue().movieGenreProperty());
        this.movieLengthColumn.setCellValueFactory(cellData -> cellData.getValue().movieLengthProperty().asObject());
        this.movieRatingColumn.setCellValueFactory(cellData -> cellData.getValue().movieRatingProperty().asObject());
        this.movieTable.setItems(App.getMovieList());

        //Initializes the game table and columns
        this.gameTitleColumn.setCellValueFactory(cellData -> cellData.getValue().gameTitleProperty());
        this.gameDeveloperColumn.setCellValueFactory(cellData -> cellData.getValue().gameDeveloperProperty());
        this.gameReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().gameReleaseYearProperty().asObject());
        this.gameGenreColumn.setCellValueFactory(cellData -> cellData.getValue().gameGenreProperty());
        this.gamePlaytimeColumn.setCellValueFactory(cellData -> cellData.getValue().gamePlaytimeProperty().asObject());
        this.gameRatingColumn.setCellValueFactory(cellData -> cellData.getValue().gameRatingProperty().asObject());
        this.gameTable.setItems(App.getGameList());

        //Initializes the tvshow table and columns
        this.tvshowTitleColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowTitleProperty());
        this.tvshowDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowDirectorProperty());
        this.tvshowReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowReleaseYearProperty().asObject());
        this.tvshowGenreColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowGenreProperty());
        this.tvshowEpisodesColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowEpisodesProperty().asObject());
        this.tvshowRatingColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowRatingProperty().asObject());
        this.tvshowTable.setItems(App.getTVShowList());
    }
}