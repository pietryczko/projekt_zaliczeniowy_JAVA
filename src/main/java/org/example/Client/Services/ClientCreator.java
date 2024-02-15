package org.example.Client.Services;

import org.example.Client.ClientBusiness;
import org.example.Client.ClientPriv;

import java.util.Scanner;

public class ClientCreator {

    Scanner scanner = new Scanner(System.in);

    public ClientBusiness createBusinessClient() {
        System.out.println("Podaj imię klienta: ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko klienta: ");
        String lastName = scanner.nextLine();

        System.out.println("Podaj pesel klienta: ");
        int pesel = scanner.nextInt();

        System.out.println("Podaj nip klienta: ");
        int nip = scanner.nextInt();
        ClientBusiness clientBusiness = new ClientBusiness(name, lastName, pesel, nip);
        System.out.println("Utworzono nowego klienta:\n" + clientBusiness);
        return clientBusiness;
    }

    public ClientPriv createPrivateClient() {
        System.out.println("Podaj imię klienta: ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko klienta: ");
        String lastName = scanner.nextLine();

        System.out.println("Podaj pesel klienta: ");
        int pesel = scanner.nextInt();

        System.out.println("Podaj numer klienta: ");
        int clientNum = scanner.nextInt();
        ClientPriv clientPriv = new ClientPriv(name, lastName, pesel, clientNum);
        System.out.println("Utworzono nowego klienta:\n" + clientPriv);
        return clientPriv;
    }
}
