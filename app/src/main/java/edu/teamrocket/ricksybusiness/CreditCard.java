package edu.teamrocket.ricksybusiness;

public class CreditCard {

    private String owner;
    private String number;
    private double credit = 3000;
    private final String SYMBOL;

    public CreditCard(String owner, String SYMBOL) {
        this.owner = owner;
        this.SYMBOL = SYMBOL;
    }

    public boolean pay(double cost) {
        boolean canPay = credit >= cost ? true : false;
        credit -= canPay ? cost : 0;
        return canPay;
    }

    public String number() {
        return this.number;
    }

    public double credit() {
        return this.credit;
    }

    @Override
    public String toString() {
        return """
                Owner: %s | Number: %s | Symbol: %s | Credit: %f
                """.formatted(this.owner, this.number(), this.SYMBOL, this.credit());
    }
}   