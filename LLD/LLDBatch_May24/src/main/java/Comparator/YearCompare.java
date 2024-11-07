package Comparator;
import java.util.*;

public class YearCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2) {
        if(m1.getYear() > m2.getYear()){
            return 1;
        }
        else if(m1.getYear() < m2.getYear()){
            return -1;
        }
        return 0;
    }
}
