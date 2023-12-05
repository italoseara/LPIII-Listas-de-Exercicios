package dev.italoseara.Ex04;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String address = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Razão social [PF/PJ]: ");
                    String razaoSocial = scanner.nextLine();
                    if (razaoSocial.equals("PF")) {
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        agenda.addContact(new PhysicalPerson(name, address, phone, email, cpf));
                    } else if (razaoSocial.equals("PJ")) {
                        System.out.print("CNPJ: ");
                        String cnpj = scanner.nextLine();
                        agenda.addContact(new LegalPerson(name, address, phone, email, cnpj));
                    } else {
                        System.out.println("Opção inválida");
                    }

                    break;
                case 2:
                    System.out.print("Nome: ");
                    name = scanner.nextLine();
                    agenda.removeContactByName(name);
                    break;
                case 3:
                    agenda.listContacts();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
