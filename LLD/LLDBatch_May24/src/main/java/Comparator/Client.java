package Comparator;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        List <Movie> list = new ArrayList<Movie>();

        list.add(new Movie("Force Awakens", 2015, 8.5));
        list.add(new Movie("Harry Potter", 2000, 9.0));
        list.add(new Movie("Star wars", 1997, 8.7));
        list.add(new Movie("Empire Strikes Back", 1980, 8.8));
        list.add(new Movie("Return of the Jedi", 1983, 8.4));

        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        System.out.println("Sorted by rating:");
        for(Movie movie : list) {
            System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRating());
        }

        System.out.println("Sorted by Year");
        YearCompare yearCompare = new YearCompare();
        Collections.sort(list, yearCompare);
        for(Movie movie : list) {
            System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRating());
        }


        System.out.println("Sorted by Name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for(Movie movie : list) {
            System.out.println(movie.getName()+" "+movie.getYear()+" "+movie.getRating());
        }
    }
}
