package org.example.config;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    public static void migrate() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:./database/space_travel", "sa", "")
                .load();
        flyway.migrate();
    }
}
