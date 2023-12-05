package dev.italoseara.Ex04;

public abstract class Contact {
    protected final String name;
    protected final String address;
    protected final String phone;
    protected final String email;

    public Contact(String name, String address, String telephoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phone = telephoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
}
