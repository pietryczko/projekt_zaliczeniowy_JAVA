package org.example.Processor;

import org.example.Client.Client;
import org.example.Client.Services.ClientService;
import org.example.Service.ScannerSingleton;

import java.util.ArrayList;
import java.util.Scanner;

public class AppProcessor {

    public boolean starApp(ArrayList<Client> clients) {
        boolean exit = true;
        Scanner scanner = ScannerSingleton.getInstance();

        ClientService clientService = new ClientService();

        System.out.println("Wybierz co chcesz zrobić:\n" +
                "1.Dodaj klienta\n" +
                "2.Wyświetl klientów\n" +
                "3.Zaktualizuj klienta\n" +
                "4.Usuń klienta\n" +
                "5.Zamknij program");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                clients.add(clientService.addClient());
                break;

            case 2:
                printClients(clients);
                break;

            case 3:
                printClients(clients);
                System.out.println("Wybierz którego klienta chcesz zaaktualizować:");
                int clientNum = scanner.nextInt() - 1;
                Client updatedClient = clientService.updateClient(clients.get(clientNum));
                clients.set(clientNum, updatedClient);
                break;

            case 4:
                printClients(clients);
                clientService.deleteClient(clients);

            case 5:
                System.out.println("Zamykam program...");
                exit = false;

            default:
                System.out.println("Podaj poprawną wartość!");
        }
        return exit;
    }

    private void printClients(ArrayList<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + 1 + ". " + clients.get(i));
        }
    }

}
