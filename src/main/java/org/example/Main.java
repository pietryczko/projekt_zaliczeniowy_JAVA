package org.example;

import org.example.Client.Client;
import org.example.Client.Services.Filler;
import org.example.Processor.AppProcessor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        AppProcessor processor = new AppProcessor();
        clients = Filler.fill(clients);
        boolean run = true;

        while (run) {
            run = processor.starApp(clients);
        }
    }
}