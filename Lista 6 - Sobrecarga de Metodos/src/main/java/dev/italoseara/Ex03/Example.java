package dev.italoseara.Ex03;

import dev.italoseara.Ex02.Date;

public class Example {
    public static void main(String[] args) {
        Date birthday = new Date(13, 10, 2004);
        Contact contact = new Contact("Italo", "italo.sseara@gmail.com", "99999-9999", birthday);

        contact.printContact();
        System.out.println("Idade: " + contact.getAge()); // 19

        contact.setPhone("88888-8888");
        System.out.println("Telefone: " + contact.getPhone()); // 88888-8888
        System.out.println("Nome: " + contact.getName()); // Italo
        System.out.println("Email: " + contact.getEmail()); // italo.sseara@gmail.com
    }
}