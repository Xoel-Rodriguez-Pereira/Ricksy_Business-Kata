package edu.teamrocket.ricksybusiness.dispatcher;

import edu.teamrocket.ricksybusiness.CreditCard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UfosParkTest {

    CreditCard abradolph;

    @BeforeEach
    public void createCreditCard() {
        abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    }
    

    UfosPark ufosPark;
    @BeforeEach
    public void createUfosPark() {    
        ufosPark = new UfosPark();

        String[] ufosID = { "unx", "dox" };
		for (String ovni : ufosID) {
			ufosPark.add(ovni);
            }
    }
    

    @Test
    public void addCustomer() {
        assertEquals("Sin ovni", ufosPark.getUfoOf(abradolph.number()));
    }
}

