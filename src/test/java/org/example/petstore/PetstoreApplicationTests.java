package org.example.petstore;

import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@ActiveProfiles("test")
class PetStoreApplicationTests {

    @Test
    void contextLoads(ApplicationContext context) {
        assertNotNull(context, "Application context should have loaded successfully");
    }

}

