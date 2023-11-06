package dev.italoseara.Ex01;

public class Example {
    public static void main(String[] args) {
        Contact contact = new Contact("Italo", "italo.sseara@gmail.com", "99999-9999");

        contact.printContact();
        System.out.println("Total de contatos: " + Contact.getTotalContacts()); // 1

        contact.setPhone("88888-8888");
        System.out.println("Telefone: " + contact.getPhone()); // 88888-8888
        System.out.println("Nome: " + contact.getName()); // Italo
        System.out.println("Email: " + contact.getEmail()); // italo.sseara@gmail.com

        Contact contact2 = new Contact("Fabricio");

        contact2.printContact();
        System.out.println("Total de contatos: " + Contact.getTotalContacts()); // 2
    }
}
