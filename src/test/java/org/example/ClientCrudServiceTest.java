package org.example;

import org.example.service.ClientCrudService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientCrudServiceTest {
    private final ClientCrudService service = new ClientCrudService();

    @Test
    void testClientCrudOperations() {
        service.createClient("Test Client");
        var client = service.getClient(1L);
        assertNotNull(client);
        assertEquals("Test Client", client.getName());

        service.updateClient(1L, "Updated Name");
        assertEquals("Updated Name", service.getClient(1L).getName());

        service.deleteClient(1L);
        assertNull(service.getClient(1L));
    }
}
