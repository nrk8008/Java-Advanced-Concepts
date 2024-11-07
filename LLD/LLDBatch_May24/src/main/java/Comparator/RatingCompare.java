package Comparator;

import java.util.*;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getRating() > m2.getRating()){
            return 1;
        }
        else if(m1.getRating() < m2.getRating()){
            return -1;
        }
        return 0;

    }
}
