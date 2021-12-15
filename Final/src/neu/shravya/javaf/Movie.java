package neu.shravya.javaf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    String movieTitle;
    Date releaseDate;
    List<String> actorList = new ArrayList<>();
    String director;

    public Movie(String movieTitle, Date releaseDate, List<String> actorList, String director){
        this.movieTitle = movieTitle;
        this.releaseDate = releaseDate;
        this.actorList = actorList;
        this.director = director;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle()
    {
        return this.getMovieTitle() +" " +this.releaseDate.getYear();
    }

    public String getClassicTitle()
    {
        return getReleaseDate().getYear() < 2000 ? "Classic" + this.getMovieTitle() : this.getMovieTitle();
    }

}
