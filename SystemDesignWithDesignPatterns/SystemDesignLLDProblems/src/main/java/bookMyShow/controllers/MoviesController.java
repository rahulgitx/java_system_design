package bookMyShow.controllers;

import bookMyShow.Movie;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class MoviesController {
    private HashMap<String, List<Movie>> locationWiseMovieList;
    private List<Movie> movieList;

    // get
    public List<Movie> getMovieFromLocation(String location){
        return locationWiseMovieList.getOrDefault(location, new ArrayList<>());
    }

    // add or update
    public void addMove(){

    }
}
