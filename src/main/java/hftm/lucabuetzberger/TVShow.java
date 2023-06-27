package hftm.lucabuetzberger;

public class TVShow {

    //Fields
    private String tvshowTitle;
    private String tvshowDirector;
    private int tvshowReleaseYear;
    private String tvshowGenre;
    private int tvshowEpisodes;
    private int tvshowRating;

    //Constructor
    public TVShow(){
    }
    public TVShow(String tvshowTitle, String tvshowDirector, int tvshowReleaseYear, String tvshowGenre, int tvshowEpisodes, int tvshowRating){
        this.tvshowTitle = tvshowTitle;
        this.tvshowDirector = tvshowDirector;
        this.tvshowReleaseYear = tvshowReleaseYear;
        this.tvshowGenre = tvshowGenre;
        this.tvshowEpisodes = tvshowEpisodes;
        this.tvshowRating = tvshowRating;
    }

    //TVShow Title
    public String getTVShowTitle(){
        return tvshowTitle;
    }
    public void setTVShowTitle(String tvShowTitle){
        this.tvshowTitle = tvShowTitle;
    }

    //TVShow Director
    public String getTVShowDirector(){
        return tvshowDirector;
    }
    public void setTVShowDirector(String tvShowDirector){
        this.tvshowDirector = tvShowDirector;
    }

    //TVShow ReleaseYear
    public int getTVShowReleaseYear(){
        return tvshowReleaseYear;
    }
    public void setTVShowReleaseYear(int tvShowReleaseYear){
        this.tvshowReleaseYear = tvShowReleaseYear;
    }

    //TVShow Genre
    public String getTVShowGenre(){
        return tvshowGenre;
    }
    public void setTVShowGenre(String tvShowGenre){
        this.tvshowGenre = tvShowGenre;
    }

    //TVShow Length
    public int getTVShowEpisodes(){
        return tvshowEpisodes;
    }
    public void setTVShowEpisodes(int tvShowEpisodes){
        this.tvshowEpisodes = tvShowEpisodes;
    }

    //TVShow Rating
    public int getTVShowRating(){
        return tvshowRating;
    }
    public void setTVShowRating(int tvShowRating){
        this.tvshowRating = tvShowRating;
    }

    public void showTVShowAttributes() {
        System.out.println(tvshowTitle+" "+tvshowDirector+" "+tvshowReleaseYear+" "+tvshowGenre+" "+tvshowEpisodes+" "+tvshowRating);
    }
}