package Comparable;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<Movie>();

        list.add(new Movie("Force Awaken", 2015, 8.3));
        list.add(new Movie("Harry Potter", 1977, 9.5));
        list.add(new Movie("Star wars", 1995, 8.8));
        list.add(new Movie("Empire Strkers Back", 1980, 8.9));
        list.add(new Movie("Return of the Jedi", 1983, 8.4));

       Collections.sort(list);
       System.out.println("Movies after sorting");
       for (Movie movie : list) {
           System.out.println(movie.getName()+" "+movie.getYear()+" "+ movie.getRating());
       }

    }
}
