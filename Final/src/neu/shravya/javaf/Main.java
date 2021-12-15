package neu.shravya.javaf;

import java.util.*;

public class Main {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void main(String[] args)  {

        //Question 1

	    int[][] matrix = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };

        Roomba rmba = new Roomba(matrix);

        //Question 2

        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> resultAnagram = GroupAnagram.groupAnagrams(str);
        System.out.println(resultAnagram);

        //Question 3
        int[] num = {1,2,3};
        int k = 3;
        int result = SubarraysSumK.subarraySum(num,k);
        System.out.println(result);


        //Question 4
        List<String> actors = new ArrayList<>();
        actors.add("Amitabh");
        actors.add("Katrina");

        List<String> actors1 = new ArrayList<>();
        actors1.add("Chris");
        actors1.add("O'hara");

        Movie movie1 = new Movie("Movie 1", new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime() ,actors, "Raj");
        Movie movie2 = new Movie("Movie 2", new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime() ,actors1, "Chris");

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);

        Movie movie3 = new Movie("Movie 3", new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime() ,actors, "romeo");
        Movie movie4 = new Movie("Movie 4", new GregorianCalendar(1997, Calendar.FEBRUARY, 11).getTime() ,actors1, "juliet");

        List<Movie> movieList1 = new ArrayList<>();
        movieList.add(movie3);
        movieList.add(movie4);

        Genre genre1 = new Genre(movieList);
        Genre genre2 = new Genre(movieList1);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(genre1);
        genreList.add(genre2);

        Netflix netflix = new Netflix(genreList);

        for(Movie movie : netflix.getFirstThreeMovies())
        {
            System.out.println(movie.getTitle());
        }

    }

    }
























