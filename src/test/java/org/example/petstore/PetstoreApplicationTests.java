package org.example.petstore;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PetStoreApplicationTests {

    @Test
    void contextLoads(ApplicationContext context) {
        assertNotNull(context, "Application context should not be null");
    }

}

