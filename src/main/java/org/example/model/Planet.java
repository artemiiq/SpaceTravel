package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "planet")
public class Planet {
    @Id
    private String id;

    @Column(name = "name", nullable = false, length = 500)
    private String name;

    public Planet() {}

    public Planet(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
