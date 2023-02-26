package movierental;

public class LoggerFramework {
    private static Dispatcher _dispatcher = new Dispatcher();
    public void main(){
    }

    public static Dispatcher getDispatcher(){
        return _dispatcher;
    }
}