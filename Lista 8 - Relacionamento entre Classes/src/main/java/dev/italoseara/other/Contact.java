package dev.italoseara.other;

public class Contact {
    private String name;
    private String email;
    private String phone;

    private static int totalContacts = 0;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;

        totalContacts++;
    }

    public Contact(String name, String email) {
        this(name, email, "");
    }

    public Contact(String name) {
        this(name, "", "");
    }

    public Contact(Contact contact) {
        this(contact.name, contact.email, contact.phone);
    }

    public static int getTotalContacts() {
        return totalContacts;
    }

    // Métodos getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    // Métodos setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return String.format("Nome: %s; Email: %s; Telefone: %s", this.name, this.email, this.phone);
    }
}
