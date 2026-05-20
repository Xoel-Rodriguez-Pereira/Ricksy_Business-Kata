package edu.teamrocket.ricksyBusiness.dispatcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Optional;

import edu.teamrocket.ricksyBusiness.CreditCard;

public class UfosPark implements GuestDispatcher {

    Double fee = 500.0;
    Map<String, String> flota = new HashMap<String, String>();

    UfosPark() {}

    @Override
    public void dispatch(CreditCard creditCard) {
        Set<String> ufosKeys = flota.keySet();
        boolean isEmpty = false;
        int position = 0;
        String key = "";
        while (!isEmpty) {
            String ufo = ufosKeys.stream().toList().get(position);
            if (flota.get(ufo) == null) {
                key = ufo;
                isEmpty = true;
            };
            position++;
        }
        if (isEmpty && creditCard.pay(this.fee)) {
            flota.put(key, creditCard.number());
        }
    }

    void add(String ufo) {
        flota.computeIfAbsent(ufo, null);
    }

    String getUfoOf(String numero) {
        Optional<String> ufo = this.flota.entrySet()
                                        .stream()
                                        .filter(entry -> numero.equals(entry.getValue()))
                                        .findFirst()
                                        .orElse(null);
        return ufo.toString();
    }

    @Override
    public String toString() {
        String text;
        this.flota.forEach((k,v) -> text.concat("""
                                                Ovni: %s || Asigned to: %s
                                                """.formated(k, v)));
        return text;
    }
}