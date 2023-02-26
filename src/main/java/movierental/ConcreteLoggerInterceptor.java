package movierental;

public class ConcreteLoggerInterceptor{
    public void logger(ContextObject object){
        System.out.printf("Frequent renter points are %f", object.getPoints());

    }
}