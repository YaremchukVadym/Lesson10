package com.roilen.easyjava;

import com.roilen.easyjava.classes.characters.Archer;
import com.roilen.easyjava.classes.characters.Healer;
import com.roilen.easyjava.classes.characters.Mage;
import com.roilen.easyjava.classes.characters.Warrior;
import com.roilen.easyjava.dungerous.Dungen;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gandalf"), new Warrior("Aragon"), new Archer("Legolas"), new Healer("Radogast"));
        party.info();
        Dungen dungen = new Dungen();
        if (party.enterDungeon(dungen)){

        }
    }
}
