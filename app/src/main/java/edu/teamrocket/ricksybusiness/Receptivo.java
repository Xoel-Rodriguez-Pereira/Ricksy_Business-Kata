package edu.teamrocket.ricksybusiness;

import edu.teamrocket.ricksybusiness.dispatcher.GuestDispatcher;
import edu.teamrocket.ricksybusiness.CreditCard;

public class Receptivo {
    private GuestDispatcher dispatcher;
    private CreditCard creditCard;

    Receptivo() {};

    void registra(GuestDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void dispatch(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    GuestDispatcher getDispatcher() {
        return this.dispatcher;
    }

    CreditCard getCreditCard() {
        return this.creditCard;
    }
}