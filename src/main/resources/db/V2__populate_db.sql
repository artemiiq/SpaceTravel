INSERT INTO client (name) VALUES
('John Doe'), ('Jane Smith'), ('Elon Musk'), ('Jeff Bezos'), ('Richard Branson');

INSERT INTO planet (id, name) VALUES
('MARS', 'Mars'), ('VEN', 'Venus'), ('EARTH', 'Earth'), ('JUP', 'Jupiter'), ('SAT', 'Saturn');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
(1, 'EARTH', 'MARS'), (2, 'VEN', 'EARTH'), (3, 'JUP', 'SAT'), (4, 'SAT', 'VEN'), (5, 'MARS', 'JUP');
