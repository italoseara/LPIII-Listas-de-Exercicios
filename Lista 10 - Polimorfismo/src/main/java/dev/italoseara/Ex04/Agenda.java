package dev.italoseara.Ex04;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                break;
            }
        }
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact findContactByCpf(String cpf) {
        for (Contact contact : contacts) {
            if (contact instanceof PhysicalPerson && ((PhysicalPerson) contact).getCpf().equals(cpf)) {
                return contact;
            }
        }
        return null;
    }

    public Contact findContactByCnpj(String cnpj) {
        for (Contact contact : contacts) {
            if (contact instanceof LegalPerson && ((LegalPerson) contact).getCnpj().equals(cnpj)) {
                return contact;
            }
        }
        return null;
    }
}
