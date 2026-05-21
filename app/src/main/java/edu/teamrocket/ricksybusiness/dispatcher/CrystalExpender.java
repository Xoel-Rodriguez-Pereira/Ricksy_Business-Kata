package edu.teamrocket.ricksybusiness.dispatcher;

import edu.teamrocket.ricksybusiness.CreditCard;

public class CrystalExpender implements GuestDispatcher {
    private final int stock;
    private final double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        return;
    }

    public int stock() {
        return this.stock;
    }
}