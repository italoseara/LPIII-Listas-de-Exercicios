package dev.italoseara.Ex04;


public class PhysicalPerson extends Contact {

    private final String cpf;

    public PhysicalPerson(String name, String address, String telephoneNumber, String email, String cpf) {
        super(name, address, telephoneNumber, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return String.format("PhysicalPerson[name=%s, address=%s, telephoneNumber=%s, email=%s, cpf=%s]", this.name, this.address, this.phone, this.email, this.cpf);
    }
}
