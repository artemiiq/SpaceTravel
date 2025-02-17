package org.example.service;

import org.example.dao.impl.ClientDaoImpl;
import org.example.model.Client;

public class ClientCrudService {
    private final ClientDaoImpl clientDao = new ClientDaoImpl();

    public void createClient(String name) {
        clientDao.save(new Client(name));
    }

    public Client getClient(Long id) {
        return clientDao.findById(id);
    }
}
