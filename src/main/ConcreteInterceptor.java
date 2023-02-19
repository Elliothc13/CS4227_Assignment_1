package main;

public class ConcreteInterceptor implements Interceptor {
    private static final double DISCOUNT = 0.5;

    @Override
    public void apply(ContextObject context) {
        int daysRented = context.getDaysRented();
        double discount = 0.0;

        if (daysRented > 7) {
            discount = context.getAmount() - (context.getAmount() * DISCOUNT);
        }
        context.setAmount(discount);
    }
}
