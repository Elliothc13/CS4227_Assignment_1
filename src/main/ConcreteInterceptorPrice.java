package main;

public class ConcreteInterceptorPrice implements Interceptor {
    private static final double DISCOUNT = 0.5;

    @Override
    public void apply(ContextObject context) {
        int daysRented = context.getDaysRented();
        int priceCode = context.getRental().getMovie().getPriceCode();
        double discount = context.getAmount();

        if (daysRented > 7 && priceCode == 0) {
            discount -= (context.getAmount() * DISCOUNT);
        }
        context.setAmount(discount);
    }
}
