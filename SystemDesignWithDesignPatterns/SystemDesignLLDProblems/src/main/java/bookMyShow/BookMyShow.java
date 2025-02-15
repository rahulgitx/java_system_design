package bookMyShow;

import bookMyShow.controllers.MoviesController;
import bookMyShow.controllers.TheatreController;
import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMyShow {
    private MoviesController moviesController;
    private TheatreController theatreController;

    public Ticket makeBooking(int seatsCount, String location, String movieName){
        List<Movie> moviesList = moviesController.getMovieList();

        HashMap<Theatre, List<Show>> showsByTheatres = theatreController.getShowsFromCity(movieName, location);


        // assuming we're consuming the show selection through prompt
        Show show = null;
        for(Map.Entry<Theatre, List<Show>> entry : showsByTheatres.entrySet()){
            for(Show show2 : entry.getValue()){
                show = show2;
                break;
            }
            if(show != null) break;
        }

        // assuming we're consuming seat no from prompt
        List<Seat> seats = null;
        Seat seat1 = show.getScreen().getSeats().get(0);
        show.getScreen().getSeats().get(0).setBooked(true);

        Seat seat2 = null;
        if(show.getScreen().getSeats().get(0).isBooked()){
            System.out.println("already booked choose another");
        }
        else{
            seat2 = show.getScreen().getSeats().get(0);
        }

        if(show.getScreen().getSeats().get(1).isBooked()){
            System.out.println("already booked choose another one");
        }
        else{
            seat2 = show.getScreen().getSeats().get(1);
        }
        seats.add(seat1); seats.add(seat2);

        Ticket ticket = new Ticket();
        ticket.setShow(show);
        ticket.setSeats(seats);
        ticket.setPrice(seats.size() * show.getPrice());
        return ticket;
    }
}
