package dev.italoseara.Ex03;

import java.util.Date;

public class Mayor extends Politician {
    public Mayor(String name, long id, Date birthDate, String party, int voteNumber) {
        super(name, id, birthDate, party, voteNumber);
    }

    @Override
    public String toString() {
        return String.format("Mayor[name=%s, id=%d, birthDate=%s, party=%s, voteNumber=%d]", this.name, this.id, this.birthDate, this.party, this.voteNumber);
    }
}
