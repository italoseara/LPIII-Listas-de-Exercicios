package dev.italoseara.Ex04;

public class LegalPerson extends Contact {

    private final String cnpj;

    public LegalPerson(String name, String address, String telephoneNumber, String email, String cnpj) {
        super(name, address, telephoneNumber, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    @Override
    public String toString() {
        return String.format("LegalPerson[name=%s, address=%s, telephoneNumber=%s, email=%s, cnpj=%s]", this.name, this.address, this.phone, this.email, this.cnpj);
    }
}
