package org.example.Client.Services;

import org.example.Client.Client;
import org.example.Client.ClientBusiness;
import org.example.Client.ClientPriv;
import org.example.Service.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientService {

    ClientCreator creator = new ClientCreator();
    Scanner scanner = ScannerSingleton.getInstance();

    public Client addClient(){
        System.out.println(
                "Wybierz typ klienta:\n" +
                "1.Klient Prywatny\n" +
                "2.Klient Biznesowy\n");

        int num = scanner.nextInt();

        switch (num) {
            case 1:
                return creator.createPrivateClient();
            case 2:
                return creator.createBusinessClient();
            default:
                System.out.println("Podaj poprawną wartość!");
                return  null;
        }
    }

    public Client updateClient(Client client) {
        showOptions();
        int choice = scanner.nextInt();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Podaj imię:\n");
                    client.setName(scanner.next());
                    break;
                case 2:
                    System.out.println("Podaj nazwisko:\n");
                    client.setLastName(scanner.next());
                    break;
                case 3:
                    System.out.println("Podaj pesel:\n");
                    client.setPesel(scanner.nextInt());
                    break;
                case 4:
                    if (client instanceof ClientPriv) {
                        System.out.println("Podaj numer klienta:\n");
                        ((ClientPriv) client).setClientNum(scanner.nextInt());
                    } else if (client instanceof  ClientBusiness) {
                        System.out.println("Podaj NIP:\n");
                        ((ClientBusiness) client).setNip(scanner.nextInt());
                    }
                    break;
            }
            System.out.println(client);
            showOptions();
            choice = scanner.nextInt();
        }
        return client;
    }

    public ArrayList<Client> deleteClient(ArrayList<Client> clients) {
        System.out.println("Którego klienta chcesz usunąć?");
        int client = scanner.nextInt() - 1;

        System.out.println("Czy napewno chcesz usunąć: " + clients.get(client) +
                "\n 1.Tak \n 2.Nie");

        int confirm = scanner.nextInt();

        if (confirm == 1) {
            clients.remove(clients.get(client));
        } else if(confirm == 2) {
            System.out.println("Klient nie został usunięty :)");
        }

        return clients;
    }
    private void showOptions() {
        System.out.println(
                "Co chcesz zaaktualizować:\n" +
                        "1.Imię\n" +
                        "2.Nazwisko\n" +
                        "3.Pesel\n" +
                        "4.NIP/Numer Klienta\n" +
                        "5.Wróć");
    }
}
