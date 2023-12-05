package dev.italoseara.Ex02;

import java.util.Date;

public class Person {
    protected String name;
    protected long id;
    protected Date birthDate;

    public Person(String name, long id, Date birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public double getLoan() {
        return 1000.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s, id=%d, birthDate=%s]", this.name, this.id, this.birthDate);
    }
}
