package hftm.lucabuetzberger;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class PrimaryController {

    //region FXML Elements: Book
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
    @FXML
    private Button editBook;
    //endregion

    //region FXML Elements: Movie
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
    @FXML
    private Button editMovie;
    //endregion

    //region FXML Elements: Game
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
    @FXML
    private Button editGame;
    //endregion

    //region FXML Elements: TVShow
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
    private Button editTVShow;
    //endregion

    @FXML
    public void initialize(){
        //region Initialize tableView, tableColumns: Book
        this.bookTitleColumn.setCellValueFactory(cellData -> cellData.getValue().bookTitleProperty());
        this.bookAuthorColumn.setCellValueFactory(cellData -> cellData.getValue().bookAuthorProperty());
        this.bookReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().bookReleaseYearProperty().asObject());
        this.bookGenreColumn.setCellValueFactory(cellData -> cellData.getValue().bookGenreProperty());
        this.bookPagesColumn.setCellValueFactory(cellData -> cellData.getValue().bookPagesProperty().asObject());
        this.bookRatingColumn.setCellValueFactory(cellData -> cellData.getValue().bookRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.bookTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getBookDetails(newValue));
        this.bookTable.setItems(App.getBookList());
        //endregion

        //region Initialize tableView, tableColumns: Movie
        this.movieTitleColumn.setCellValueFactory(cellData -> cellData.getValue().movieTitleProperty());
        this.movieDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().movieDirectorProperty());
        this.movieReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().movieReleaseYearProperty().asObject());
        this.movieGenreColumn.setCellValueFactory(cellData -> cellData.getValue().movieGenreProperty());
        this.movieLengthColumn.setCellValueFactory(cellData -> cellData.getValue().movieLengthProperty().asObject());
        this.movieRatingColumn.setCellValueFactory(cellData -> cellData.getValue().movieRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.movieTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getMovieDetails(newValue));
        this.movieTable.setItems(App.getMovieList());
        //endregion

        //region Initialize tableView, tableColumns: Game
        this.gameTitleColumn.setCellValueFactory(cellData -> cellData.getValue().gameTitleProperty());
        this.gameDeveloperColumn.setCellValueFactory(cellData -> cellData.getValue().gameDeveloperProperty());
        this.gameReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().gameReleaseYearProperty().asObject());
        this.gameGenreColumn.setCellValueFactory(cellData -> cellData.getValue().gameGenreProperty());
        this.gamePlaytimeColumn.setCellValueFactory(cellData -> cellData.getValue().gamePlaytimeProperty().asObject());
        this.gameRatingColumn.setCellValueFactory(cellData -> cellData.getValue().gameRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.gameTable.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> this.getGameDetails(newValue));
        this.gameTable.setItems(App.getGameList());
        //endregion

        //region Initialize tableView, tableColumns: TVShow
        this.tvshowTitleColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowTitleProperty());
        this.tvshowDirectorColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowDirectorProperty());
        this.tvshowReleaseYearColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowReleaseYearProperty().asObject());
        this.tvshowGenreColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowGenreProperty());
        this.tvshowEpisodesColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowEpisodesProperty().asObject());
        this.tvshowRatingColumn.setCellValueFactory(cellData -> cellData.getValue().tvshowRatingProperty().asObject());
        //Listener to fill elements in PrimaryView
//        this.tvshowTable.getSelectionModel().selectedItemProperty()
//              .addListener((observable, oldValue, newValue) -> this.showTVShowDetails(newValue));
        this.tvshowTable.setItems(App.getTVShowList());
        //endregion

        //region Initialize Listener editButton: Book
        bookTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                // Book is selected, enable the editBook button
                editBook.setDisable(false);
            } else {
                // No book is selected, disable the editBook button
                editBook.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: Movie
        movieTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //Movie is selected, enable the editMovie button
                editMovie.setDisable(false);
            } else {
                //No movie is selected, disable the editMovie button
                editMovie.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: Game
        gameTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //Game is selected, enable the editGame button
                editGame.setDisable(false);
            } else {
                //No game is selected, disable the editGame button
                editGame.setDisable(true);
            }
        });
        //endregion

        //region Initialize Listener editButton: TVShow
        tvshowTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                //TVShow is selected, enable the editTVShow button
                editTVShow.setDisable(false);
            } else {
                //No tvshow is selected, disable the editTVShow button
                editTVShow.setDisable(true);
            }
        });
        //endregion
    }

    //region Buttons: Book
    @FXML
    private void newBook() {
        App.switchToNewBookView();
    }

    @FXML
    private void editBook() {
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            App.switchToBookEditView(selectedBook);
        } else {
            System.out.println("No book selected");
        }
    }

    @FXML
    private void deleteBook(){
        Book selectedBook = bookTable.getSelectionModel().getSelectedItem();
        if (selectedBook != null){
            ObservableList<Book> bookList = App.getBookList();
            bookTable.getItems().remove(selectedBook);
            bookList.remove(selectedBook);
            System.out.println("Books in bookList:");
            for (Book book : bookList) {
                System.out.println(book.getBookTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: Movie
    @FXML
    private void newMovie(){
        App.switchToNewMovieView();
    }

    @FXML
    private void editMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            App.switchToMovieEditView(selectedMovie);
        } else {
            System.out.println("No movie selected");
        }
    }

    @FXML
    private void deleteMovie(){
        Movie selectedMovie = movieTable.getSelectionModel().getSelectedItem();
        if (selectedMovie != null){
            ObservableList<Movie> movieList = App.getMovieList();
            movieTable.getItems().remove(selectedMovie);
            movieList.remove(selectedMovie);
            System.out.println("Movies in movieList:");
            for (Movie movie : movieList) {
                System.out.println(movie.getMovieTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: Game
    @FXML
    private void newGame(){
        App.switchToNewGameView();
    }

    @FXML
    private void editGame(){
        Game selectedGame = gameTable.getSelectionModel().getSelectedItem();
        if (selectedGame != null){
            App.switchToGameEditView(selectedGame);
        } else {
            System.out.println("No game selected");
        }
    }

    @FXML
    private void deleteGame(){
        Game selectedGame = gameTable.getSelectionModel().getSelectedItem();
        if (selectedGame != null){
            ObservableList<Game> gameList = App.getGameList();
            gameTable.getItems().remove(selectedGame);
            gameList.remove(selectedGame);
            System.out.println("Games in gameList:");
            for (Game game : gameList) {
                System.out.println(game.getGameTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion

    //region Buttons: TVShow
    @FXML
    private void newTVShow(){
        App.switchToNewTVShowView();
    }

    @FXML
    private void editTVShow(){
        TVShow selectedTVShow = tvshowTable.getSelectionModel().getSelectedItem();
        if (selectedTVShow != null){
            App.switchToTVShowEditView(selectedTVShow);
        } else {
            System.out.println("No tvshow selected");
        }
    }

    @FXML
    private void deleteTVShow(){
        TVShow selectedTVShow = tvshowTable.getSelectionModel().getSelectedItem();
        if (selectedTVShow != null){
            ObservableList<TVShow> tvshowList = App.getTVShowList();
            tvshowTable.getItems().remove(selectedTVShow);
            tvshowList.remove(selectedTVShow);
            System.out.println("TVShows in tvshowList:");
            for (TVShow tvshow : tvshowList) {
                System.out.println(tvshow.getTVShowTitle()); // Print book title
            }
        } else{
        }
    }
    //endregion
}
