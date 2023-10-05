package dev.italoseara.Ex02;

import dev.italoseara.Ex01.Date;

public class Example {
    public static void main(String[] args) {
        Date birthday = new Date();
        birthday.initializeDate(13, 10, 2004);

        Contact contact = new Contact();
        contact.initializeContact("Italo", "italo.sseara@gmail.com", "99999-9999", birthday);

        contact.printContact();
        System.out.println("Idade: " + contact.getAge()); // 18 (faltam poucos dias para o aniversário :D)

        contact.setPhone("88888-8888");
        System.out.println("Telefone: " + contact.getPhone()); // 88888-8888

        // contact.setName("Italo Seara"); // Não é possível alterar o nome
        System.out.println("Nome: " + contact.getName()); // Italo

        System.out.println("Email: " + contact.getEmail()); // italo.sseara@gmail.com
    }
}
