package edu.teamrocket.ricksybusiness.dispatcher;


import java.util.HashMap;
import java.util.Map;


import edu.teamrocket.ricksybusiness.CreditCard;

public class UfosPark implements GuestDispatcher {

    Double fee = 500.0;
    Map<String, String> flota = new HashMap<>();

    public UfosPark() {};

    @Override
    public void dispatch(CreditCard creditCard) {
        boolean isEmpty = this.flota.values().stream()
                                    .filter(value -> value == "")
                                    .findFirst()
                                    .isEmpty();

        if (isEmpty && creditCard.credit() >= fee) {
            String ufo = this.flota.entrySet().stream()
                                    .filter(entry -> entry.getValue() == "")
                                    .findFirst()
                                    .map(Map.Entry::getKey)
                                    .toString();
            flota.put(ufo, creditCard.number());
        }
    }

    public void add(String ufo) {
        this.flota.putIfAbsent(ufo, "");
    }

    public String getUfoOf(String number) {
        return this.flota.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().equals(number))
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse("Sin ovni");
    }

    @Override
    public String toString() {
        String text = "";
        return text;        
    }
}