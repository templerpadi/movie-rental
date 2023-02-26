package movierental;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Collections;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration<Rental> rentals = Collections.enumeration(_rentals);
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double amountFor(Rental aRental){
        return aRental.getCharge();
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration<Rental> rentals = Collections.enumeration(_rentals);

        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    double getTotalFrequentRenterPoints(){
        double result = 0;
        Enumeration<Rental> rentals = Collections.enumeration(_rentals);

        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        ContextObject contextObject = new ContextObject(result);
        return result;
    }

    public String htmlStatement() {

        Enumeration<Rental> rentals = Collections.enumeration(_rentals);
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
       
        while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
       
        //show figures for each rental
        result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
       
        }
        //add footer lines
        result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" +
        String.valueOf(getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        return result;
       
        } 
}
