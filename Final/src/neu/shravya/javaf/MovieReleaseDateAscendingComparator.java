package neu.shravya.javaf;

import java.util.Comparator;

public class MovieReleaseDateAscendingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie first, Movie second) {
        return second.getReleaseDate().compareTo(first.getReleaseDate());
    }

}
