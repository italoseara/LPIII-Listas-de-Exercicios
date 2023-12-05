package dev.italoseara.Ex03;

import dev.italoseara.Ex02.Person;

import java.util.Date;

public class Politician extends Person {
    protected String party;
    protected int voteNumber;

    public Politician(String name, long id, Date birthDate, String party, int voteNumber) {
        super(name, id, birthDate);
        this.party = party;
        this.voteNumber = voteNumber;
    }

    public String getParty() {
        return this.party;
    }

    public int getVoteNumber() {
        return this.voteNumber;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setVoteNumber(int voteNumber) {
        this.voteNumber = voteNumber;
    }

    @Override
    public String toString() {
        return String.format("Politic[name=%s, id=%d, birthDate=%s, party=%s, voteNumber=%d]", this.name, this.id, this.birthDate, this.party, this.voteNumber);
    }
}
