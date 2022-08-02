package com.roilen.easyjava;

import com.roilen.easyjava.classes.CharacterClass;
import com.roilen.easyjava.dungerous.Dungen;

public class Party {
    private CharacterClass[] partyMembers;
    public Party(CharacterClass... members){
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];
        }
    }
    public boolean enterDungeon(Dungen dungen){
        return dungen.open(this);
    }

    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info(){
        for(CharacterClass partyMember : partyMembers){
            partyMember.info();
        }
    }
}
