package Comparable;
import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;
    // constructor
    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }
    // getters
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public double getRating() {
        return rating;
    }

    public int compareTo(Movie m) {
        if(this.getYear()==m.getYear()){
            return 0;
        }
        else if(this.getYear()<m.getYear()){
            return 1;
        }
        else{return -1;}
    }

}
