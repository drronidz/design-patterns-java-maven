package guru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:46 PM
*/

class MailClientTest {
    @Test
    void testConfigureMailClientForDifferentEnvironments() {
        MailClient operaMailClient = new OperaMailClient();
        assertTrue(operaMailClient.configureForMac());
        assertTrue(operaMailClient.configureForWindows());

        MailClient squirrelMailClient = new SquirrelMailClient();
        assertTrue(squirrelMailClient.configureForMac());
        assertTrue(squirrelMailClient.configureForWindows());
    }
}