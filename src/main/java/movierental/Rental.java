package movierental;



/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    double getCharge(){
        return _movie.getCharge(_daysRented);
    }
        
    public int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_daysRented);
        }
        

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
