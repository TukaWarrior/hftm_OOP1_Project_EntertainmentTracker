package hftm.lucabuetzberger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public static void main(String[] args) {
        //Books
        System.out.println("Books:");
        Book b1 = new Book("The Shining", "Steven King", 1998, "Horror", 447, 86);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Roman", 281, 95);
        Book b3 = new Book();
        b3.setBookTitle("1984");
        b3.setBookAuthor("George Orwell");
        b3.setBookReleaseYear(1949);
        b3.setBookGenre("Dystopisch");
        b3.setBookPages(328);
        b3.setBookRating(92);

        b1.showBookAttributes();
        b2.showBookAttributes();
        b3.showBookAttributes();

        //Movies
        System.out.println("Movies:");
        Movie m1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", 2001, "Fantasy", 178, 92);
        Movie m2 = new Movie("Back to the Future", "Robert Zemeckis", 1985, "Sci-Fi", 116, 87);
        Movie m3 = new Movie();
        m3.setMovieTitle("Forrest Gump");
        m3.setMovieDirector("Robert Zemeckis");
        m3.setMovieReleaseYear(1994);
        m3.setMovieGenre("Drama");
        m3.setMovieLength(142);
        m3.setMovieRating(88);

        m1.showMovieAttributes();
        m2.showMovieAttributes();
        m3.showMovieAttributes();

        System.out.println("Games:");
        Game g1 = new Game("The Legend of Zelda: Ocarina of Time", "Nintendo EAD", 1998, "Action-Adventure", 39, 99);
        Game g2 = new Game("Metroid Prime", "Retro Studios", 2002, "Metroidvania", 17, 97);
        Game g3 = new Game();
        g3.setGameTitle("Outer Wilds");
        g3.setGameDeveloper("Mobius Digital");
        g3.setGameReleaseYear(2019);
        g3.setGameGenre("Exploration");
        g3.setGamePlaytime(26);
        g3.setGameRating(100);

        g1.showGameAttributes();
        g2.showGameAttributes();
        g3.showGameAttributes();

        System.out.println("TVShows:");
        TVShow t1 = new TVShow("The Expanse", "Mark Fergus", 2016, "Sci-Fi", 10, 85);
        TVShow t2 = new TVShow("The Boys", "Eric Kripk", 2016, "Superhero", 24, 87);
        TVShow t3 = new TVShow();
        t3.setTVShowTitle("Final Space");
        t3.setTVShowDirector("Olan Rogers");
        t3.setTVShowReleaseYear(2018);
        t3.setTVShowGenre("Comedy");
        t3.setTVShowEpisodes(36);
        t3.setTVShowRating(95);

        t1.showTVShowAttributes();
        t2.showTVShowAttributes();
        t3.showTVShowAttributes();

        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setSceneRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
}