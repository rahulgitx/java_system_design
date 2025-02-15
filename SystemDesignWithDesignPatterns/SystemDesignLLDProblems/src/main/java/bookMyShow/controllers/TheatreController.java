package bookMyShow.controllers;

import bookMyShow.Show;
import bookMyShow.Theatre;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public class TheatreController {
    HashMap<String, List<Theatre>> locationWiseTheatres;
    List<Theatre> theatres;

    // get list of shows theatre wise
    public HashMap<Theatre, List<Show>> getShowsFromCity(String movie, String location){
        HashMap<Theatre, List<Show>> res = new HashMap<>();
        List<Theatre> theatreList = locationWiseTheatres.getOrDefault(location, new ArrayList<>());
        for(Theatre theatre : theatreList){
            List<Show> showList = new ArrayList<>();
            for(Show show : theatre.getShows()){
                if(show.getMovie().getName().equals(movie)) showList.add(show);
            }
            res.put(theatre, showList);
        }
        return res;
    }

    // get
    public List<Theatre> getTheatreListFromLocation(String location){
        return locationWiseTheatres.getOrDefault(location, new ArrayList<>());
    }


    // add or update
    public void addTheatre(String location, Theatre theatre){
        List<Theatre> theatreList = locationWiseTheatres.getOrDefault(location, new ArrayList<>());
        theatreList.add(theatre);
        locationWiseTheatres.put(location, theatreList);
        theatres.add(theatre);
    }

    // delete
    public void updateTheatre(String location, Theatre theatre){
        List<Theatre> theatreList = locationWiseTheatres.getOrDefault(location, new ArrayList<>());
        theatreList.remove(theatre);
        locationWiseTheatres.put(location, theatreList);
        theatres.remove(theatre);
    }

}
