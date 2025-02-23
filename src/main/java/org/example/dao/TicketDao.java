package org.example.dao;

import org.example.model.Ticket;
import java.util.List;

public interface TicketDao {
    void save(Ticket ticket);

    Ticket findById(Long id);

    List<Ticket> findAll();

    void delete(Long id);
}
