package main;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<>();

    public Dispatcher() {
    	interceptors.add(new ConcreteInterceptor());
    }

    public void dispatch(ContextObject context) {
        for (Interceptor interceptor : interceptors) {
            interceptor.apply(context);
        }
    }
}
