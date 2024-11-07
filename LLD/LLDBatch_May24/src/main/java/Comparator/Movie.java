package Comparator;

public class Movie {
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
}
