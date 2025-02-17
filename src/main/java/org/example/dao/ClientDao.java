package org.example.dao;

import org.example.model.Client;
import java.util.List;

public interface ClientDao {
    void save(Client client);
    Client findById(Long id);
    List<Client> findAll();
    void update(Client client);
    void delete(Long id);
}
