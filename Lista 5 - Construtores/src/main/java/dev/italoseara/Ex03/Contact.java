package dev.italoseara.Ex03;

import dev.italoseara.Ex02.Date;

public class Contact {
    private String name;
    private String email;
    private String phone;
    private Date birthday;

    public Contact(String name, String email, String phone, Date birthday) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public void printContact() {
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.phone);
        System.out.println("Aniversário: " + this.birthday);
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

    public Date getBirthday() {
        return this.birthday;
    }

    public int getAge() {
        return 2023 - this.birthday.getYear();
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

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
