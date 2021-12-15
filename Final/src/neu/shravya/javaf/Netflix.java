package neu.shravya.javaf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Netflix {
    List<Genre> genreList = new ArrayList<>();

    public Netflix(List<Genre> genreList){
        this.genreList = genreList;
    }

    public List<Movie> getAllMovies()
    {
        return getGenreList().stream().flatMap(x -> x.getMovieList().stream())
                .collect(Collectors.toList());
    }

    public List<Movie> getFirstThreeMovies()
    {
        return getAllMovies().stream().sorted(new MovieReleaseDateAscendingComparator()).limit(3).collect(Collectors.toList());
    }

    public Predicate<Movie> getMoviesCreatedBefore1990()
    {
        return  x -> x.getReleaseDate().getYear() < 1990;
    }

    public Predicate<Movie> getMoviesCreatedBefore2000()
    {
        return x -> x.getReleaseDate().getYear() < 2000;
    }

    public Predicate<Movie> getMoviesBetween2000And1990()
    {
        return getMoviesCreatedBefore2000().and(getMoviesCreatedBefore1990().negate());
    }


    public List<String> getClassicTitles()
    {
        return getGenreList().stream().flatMap(x -> x.getMovieList().stream()).collect(Collectors.toList()).stream()
                .map(Movie::getClassicTitle)
                .collect(Collectors.toList());
    }

    public List<Genre> getGenreList() {
        return genreList;
    }
}
