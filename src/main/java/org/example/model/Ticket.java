package org.example.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id", nullable = false)
    private Planet fromPlanet;

    @ManyToOne
    @JoinColumn(name = "to_planet_id", nullable = false)
    private Planet toPlanet;

    public Ticket() {}

    public Ticket(Client client, Planet fromPlanet, Planet toPlanet) {
        if (client == null || fromPlanet == null || toPlanet == null) {
            throw new IllegalArgumentException("Client and planets cannot be null");
        }
        this.client = client;
        this.fromPlanet = fromPlanet;
        this.toPlanet = toPlanet;
    }

    public Long getId() { return id; }
    public Instant getCreatedAt() { return createdAt; }
    public Client getClient() { return client; }
    public Planet getFromPlanet() { return fromPlanet; }
    public Planet getToPlanet() { return toPlanet; }
}
