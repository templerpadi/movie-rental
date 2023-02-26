package movierental;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher{
    private List<ConcreteLoggerInterceptor> interceptors;

    Dispatcher(){
        interceptors = new ArrayList<ConcreteLoggerInterceptor>();
    }

    void attach(ConcreteLoggerInterceptor concrete_logger){
        interceptors.add(concrete_logger);
    }

    void detach(ConcreteLoggerInterceptor concrete_logger){
        interceptors.remove(concrete_logger);
    }

    void notify(ContextObject object){
        for(int i = 0; i <= interceptors.size(); i++){
            interceptors.get(i).logger(object);
        }
    }
}