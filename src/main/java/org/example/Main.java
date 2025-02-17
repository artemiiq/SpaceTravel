package org.example;

import org.example.model.Client;
import org.example.service.ClientCrudService;

public class Main {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();

        clientService.createClient("New Client");
        Client client = clientService.getClient(1L);
        System.out.println("Created: " + client.getName());

        clientService.createClient("Updated Client");
        System.out.println("Updated: " + clientService.getClient(1L).getName());

        clientService.getClient(1L);
        System.out.println("Deleted client 1");
    }
}
