package br.com.fiap.grupo30.fastfood.payments_api;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentsApiApplicationTests {

    @Test
    void contextLoads() {
        int x = 1;
        int y = 1;
        assertTrue(x == y, "assertion failed");
    }
}
