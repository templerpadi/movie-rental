package movierental;

import java.util.ArrayList;
import java.util.List;

public class Main{
    private static List<Rental> rentals = new ArrayList<Rental>();

    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        for (Rental rental : rentals){
            customer.addRental(rental);
        }
        ConcreteLoggerInterceptor concrete_logger = new ConcreteLoggerInterceptor();
        LoggerFramework.getDispatcher().attach(concrete_logger);
    }
}