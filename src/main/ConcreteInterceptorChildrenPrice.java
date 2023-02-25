package main;

public class ConcreteInterceptorChildrenPrice implements Interceptor {
    private static final double DISCOUNT = 1.0;

    @Override
    public void apply(ContextObject context) {
        int daysRented = context.getDaysRented();
        int priceCode = context.getRental().getMovie().getPriceCode();
        double discount = context.getAmount();

        if (daysRented > 7 && priceCode == 2) {
            discount -= (context.getAmount() * DISCOUNT);
        }
        context.setAmount(discount);
    }
}
