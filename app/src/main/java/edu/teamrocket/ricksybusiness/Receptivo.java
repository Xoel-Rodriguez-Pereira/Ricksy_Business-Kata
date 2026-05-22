package edu.teamrocket.ricksybusiness;

import edu.teamrocket.ricksybusiness.dispatcher.GuestDispatcher;

import java.util.LinkedHashSet;
import java.util.Set;

public class Receptivo {
    
    Set<GuestDispatcher> receptivo = new LinkedHashSet<>();

    Receptivo() {};

    void registra(GuestDispatcher dispatcher) {
        this.receptivo.add(dispatcher);
    }

    void dispatch(CreditCard creditCard) {
        for (GuestDispatcher dispatcher : receptivo) {
            dispatcher.dispatch(creditCard);
        }
    }

}