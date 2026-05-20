package edu.teamrocket.ricksyBusiness;

public class CreditCard {

    private String owner;
    private String number;
    private double credit;
    private final String SYMBOL;

    CreditCard(String owner, String symbol) {
        this.owner = owner;
        this.SYMBOL = symbol;
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
                Owner: %s | Number: %s | Symbol: %s | Credit: %d
                """.formatted(this.owner, this.number(), this.SYMBOL, this.credit());
    }
}   