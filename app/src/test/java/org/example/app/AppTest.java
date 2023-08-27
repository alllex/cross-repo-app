package org.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello from another repo, App!", classUnderTest.getGreeting());
    }
}
