package hftm.lucabuetzberger;

public class Game {

    //Fields
    private String gameTitle;
    private String gameDeveloper;
    private int gameReleaseYear;
    private String gameGenre;
    private int gamePlaytime;
    private int gameRating;

    //Constructor
    public Game(){
    }
    public Game(String gameTitle, String gameDeveloper, int gameReleaseYear, String gameGenre, int gamePlaytime, int gameRating) {
        this.gameTitle = gameTitle;
        this.gameDeveloper = gameDeveloper;
        this.gameReleaseYear = gameReleaseYear;
        this.gameGenre = gameGenre;
        this.gamePlaytime = gamePlaytime;
        this.gameRating = gameRating;
    }

    //Game Title
    public String getGameTitle(){
        return gameTitle;
    }
    public void setGameTitle(String gameTitle){
        this.gameTitle = gameTitle;
    }

    //Game Developer
    public String getGameDeveloper(){
        return gameDeveloper;
    }
    public void setGameDeveloper(String gameDeveloper){
        this.gameDeveloper = gameDeveloper;
    }

    //Game ReleaseYear
    public int getGameReleaseYear(){
        return gameReleaseYear;
    }
    public void setGameReleaseYear(int gameReleaseYear){
        this.gameReleaseYear = gameReleaseYear;
    }

    //Game Genre
    public String getGameGenre(){
        return gameGenre;
    }
    public void setGameGenre(String gameGenre){
        this.gameGenre = gameGenre;
    }

    //Game Playtime
    public int getGamePlaytime(){
        return gamePlaytime;
    }
    public void setGamePlaytime(int gamePlaytime){
        this.gamePlaytime = gamePlaytime;
    }

    //Game Rating
    public int getGameRating(){
        return gameRating;
    }
    public void setGameRating(int gameRating){
        this.gameRating = gameRating;
    }

    public void showGameAttributes() {
        System.out.println(gameTitle+" "+gameDeveloper+" "+gameReleaseYear+" "+gameGenre+" "+gamePlaytime+" "+gameReleaseYear);
    }
}