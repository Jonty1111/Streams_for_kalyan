package com.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Movie{
    String movieType;
    int t1;

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public Movie(String movieType) {
        this.movieType = movieType;
    }

    public Movie(String movieType, int t1) {
        this.movieType = movieType;
        this.t1 = t1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieType='" + movieType + '\'' +
                ", t1=" + t1 +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {

        //Get all the List of Movies the belongs to the category of "Thriller" with in the range of 1960 to 1980
        List<Movie> lst=new ArrayList<Movie>();
        lst.add(new Movie("thriller",1967));
        lst.add(new Movie("action",1980));
        lst.add(new Movie("thriller",1999));
        List<Movie> person = lst.stream().filter(p->p.getMovieType().equals("thriller")).filter(t->t.getT1()>1960 && t.getT1()<1980).collect(Collectors.toList());
        System.out.println("List of Movies that are of type Thriller and released btw 1960 to 1980 : " +person);



    }
}
