package neu.shravya.javaf;

import java.util.*;

public class Genre {
    List<Movie> movieList = new ArrayList<>();

    public Genre(List<Movie> movieList){
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

}
