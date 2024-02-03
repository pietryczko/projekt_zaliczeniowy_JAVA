package org.example.Client.Services;

import org.example.Client.Client;
import org.example.Client.ClientBusiness;
import org.example.Client.ClientPriv;

import java.util.ArrayList;

public class Filler {

    public static ArrayList<Client> fill(ArrayList<Client> clients) {

        clients.add(new ClientBusiness("James", "Bond", 700112345, 987654321));
        clients.add(new ClientBusiness("Indiana", "Jones", 800223456, 123456789));
        clients.add(new ClientBusiness("Hannibal", "Lecter", 900334567, 111111111));
        clients.add(new ClientBusiness("Darth", "Vader", 600445678, 222222222));

        clients.add(new ClientPriv("Mickey", "Mouse", 100112345, 987654321));
        clients.add(new ClientPriv("Donald", "Duck", 200223456, 123456789));
        clients.add(new ClientPriv("Goofy", "Goof", 300334567, 111111111));
        clients.add(new ClientPriv("Cinderella", "Cinderella", 400445678, 222222222));
        return clients;
    }
}
