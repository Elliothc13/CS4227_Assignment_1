package main;

public class ContextObject {
    private Rental rental;
    private double amount;

    public ContextObject(Rental rental) {
        this.rental = rental;
        this.amount = rental.getCharge();
    }

    public Rental getRental() {
        return rental;
    }

    public int getDaysRented() {
        return rental.getDaysRented();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
