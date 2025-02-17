CREATE TABLE client (
    id IDENTITY PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) BETWEEN 3 AND 200)
);

CREATE TABLE planet (
    id VARCHAR(10) PRIMARY KEY CHECK (id ~ '^[A-Z0-9]+$'),
    name VARCHAR(500) NOT NULL
);

CREATE TABLE ticket (
    id IDENTITY PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    client_id BIGINT NOT NULL,
    from_planet_id VARCHAR(10) NOT NULL,
    to_planet_id VARCHAR(10) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES client(id) ON DELETE CASCADE,
    FOREIGN KEY (from_planet_id) REFERENCES planet(id),
    FOREIGN KEY (to_planet_id) REFERENCES planet(id)
);
