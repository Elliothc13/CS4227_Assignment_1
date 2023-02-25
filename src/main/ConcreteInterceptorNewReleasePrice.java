package main;

public class ConcreteInterceptorNewReleasePrice implements Interceptor {
	private static final double DISCOUNT = 0.2;

    @Override
    public void apply(ContextObject context) {
        int daysRented = context.getDaysRented();
        int priceCode = context.getRental().getMovie().getPriceCode();
        double discount = context.getAmount();

        if (daysRented > 7 && priceCode == 1) {
            discount -= (context.getAmount() * DISCOUNT);
        }
        context.setAmount(discount);
    }
}
