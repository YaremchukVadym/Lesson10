package com.roilen.easyjava.dungerous;

import com.roilen.easyjava.Party;

public class Dungen implements BasicDungeon{
    private boolean isOpened = false;
    @Override
    public boolean open(Party party) {
        if(party.getPartyMembers().length < 3){
            System.out.println("Not enough party members!");
            isOpened = false;
        }
        else {
            System.out.println("Welcome, heroes! \nGet ready for the adventure");
            isOpened = true;
        }
        return isOpened;
    }
}
